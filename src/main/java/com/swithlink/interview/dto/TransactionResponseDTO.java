package com.swithlink.interview.dto;

import io.swagger.annotations.ApiModelProperty;

public class TransactionResponseDTO {


    @ApiModelProperty(position = 0)
    private long id;
    @ApiModelProperty(position = 1)
    private String username;
    @ApiModelProperty(position = 2)
    private String description;
    @ApiModelProperty(position = 3)
    private double amount;
    @ApiModelProperty(position = 4)
    private String action;
    @ApiModelProperty(position = 5)
    private String channel;     
}
