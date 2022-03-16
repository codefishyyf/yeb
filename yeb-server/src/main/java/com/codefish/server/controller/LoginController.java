package com.codefish.server.controller;

import com.codefish.server.pojo.Admin;
import com.codefish.server.pojo.AdminLoginParam;
import com.codefish.server.reponse.ActionResult;
import com.codefish.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @Author: yyf
 * @Description: 登录
 */
@Api(tags = "LoginController")
@RestController
public class LoginController {

    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public ActionResult login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }

    @ApiOperation(value = "获取当前用户的登录信息")
    @PostMapping("/admin/info")
    public Admin getAdminInfo(Principal principal){
        if (null==principal){
            return null;
        }
        String username = principal.getName();
        Admin admin=adminService.getAdminByUserName(username);
        //返回给前端的密码是加密的，没有用，所以次处设置为null
        admin.setPassword(null);
        return admin;
    }
    @ApiOperation(value="退出登录")
    @PostMapping("/logout")
    public ActionResult logout(){
        return ActionResult.success("注销成功！");
    }
}
