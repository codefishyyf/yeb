package com.codefish.server.config.security;

import com.codefish.server.reponse.ActionResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: yyf
 * @Description: 当访问接口没有权限时，自定义返回结果
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ActionResult actionResult = ActionResult.error("权限不足，请联系管理员！");
        actionResult.setCode(403);
        out.write(new ObjectMapper().writeValueAsString(actionResult));
        out.flush();
        out.close();
    }
}