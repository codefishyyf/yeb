package com.codefish.server.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Author: yyf
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "AdminLoginParam对象", description = "")
public class AdminLoginParam {
    @ApiModelProperty(value = "用户名", required = true)

    private String username;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
