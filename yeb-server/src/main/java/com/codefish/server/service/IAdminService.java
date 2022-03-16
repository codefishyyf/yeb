package com.codefish.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.codefish.server.pojo.Admin;
import com.codefish.server.reponse.ActionResult;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yyf
 * @since 2022-03-15
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    ActionResult login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名返回用户信息
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
