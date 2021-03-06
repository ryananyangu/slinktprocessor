package com.swithlink.interview.dto;

import java.util.List;

import com.swithlink.interview.models.Role;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDataDTO {
  
  @ApiModelProperty(position = 0)
  private String username;
  @ApiModelProperty(position = 1)
  private String email;
  @ApiModelProperty(position = 2)
  private String phonenumber;
  @ApiModelProperty(position = 3)
  private String servicepin;
  @ApiModelProperty(position = 4)
  private String password;
  @ApiModelProperty(position = 5)
  List<Role> roles;
}