package com.swithlink.interview.controllers;

import com.swithlink.interview.dto.TransactionDTO;
import com.swithlink.interview.models.Transaction;
import com.swithlink.interview.services.TransactionService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/transactions")
@Api(tags = "transactions")
public class TransactionsController {


    @Autowired
    private TransactionService transactionService;
  
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/create")
    @ApiOperation(value = "${TransactionsController.create}")
    @ApiResponses(value = {//
        @ApiResponse(code = 400, message = "Something went wrong"), //
        @ApiResponse(code = 403, message = "Access denied"), //
        @ApiResponse(code = 422, message = "Username is already in use")})
    public Transaction create(@ApiParam("New Transaction") @RequestBody TransactionDTO tDto) {
      return transactionService.saveTransaction(modelMapper.map(tDto, Transaction.class),tDto.getUsername());
    }
    
}
