package com.swithlink.interview.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDTO {


    @ApiModelProperty(position = 0)
    private String description;
    @ApiModelProperty(position = 1)
    private double amount;
    @ApiModelProperty(position = 2)
    private String action;
    @ApiModelProperty(position = 3)
    private String channel;
    @ApiModelProperty(position = 4)
    private String username;   
    
}
