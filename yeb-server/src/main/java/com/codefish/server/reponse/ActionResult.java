package com.codefish.server.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: yyf
 * @Description: 公共返回对象,后端统一返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionResult implements Serializable {
    private static final long serialVersionUID=1L;
    private long code;
    private String message;
    private Object data;

    /**
     * 成功返回结果
     *
     * @param message
     * @return
     */
    public static ActionResult success(String message){
        return new ActionResult(200,message,null);
    }

    /**
     * 成功返回结果
     * @param message
     * @param data
     * @return
     */
    public static ActionResult success(String message,Object data){
        return new ActionResult(200,message,data);
    }

    /**
     * 失败返回结果
     *
     * @param message
     * @return
     */
    public static ActionResult error(String message){
        return new ActionResult(500,message,null);
    }
    /**
     * 失败返回结果
     * @param message
     * @param data
     * @return
     */
    public static ActionResult error(String message,Object data){
        return new ActionResult(500,message,data);
    }
}
