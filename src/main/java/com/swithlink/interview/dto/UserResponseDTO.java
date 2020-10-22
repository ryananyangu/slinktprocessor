package com.swithlink.interview.dto;

import java.util.List;

import com.swithlink.interview.models.Role;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponseDTO {

  @ApiModelProperty(position = 0)
  private Integer id;
  @ApiModelProperty(position = 1)
  private String username;
  @ApiModelProperty(position = 2)
  private String email;
  @ApiModelProperty(position = 3)
  private String phonenumber;
  @ApiModelProperty(position = 4)
  List<Role> roles;
}
