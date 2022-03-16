package com.codefish.server.config.security;

import com.codefish.server.reponse.ActionResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: yyf
 * @Description: 当未登录或者token失效时访问接口时，自定义的返回结果
 */
@Component
public class RestAuthorizationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ActionResult actionResult = ActionResult.error("未登录，请登录！");
        actionResult.setCode(401);
        out.write(new ObjectMapper().writeValueAsString(actionResult));
        out.flush();
        out.close();
    }
}
