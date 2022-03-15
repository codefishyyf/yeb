package com.codefish.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codefish.server.mapper.MenuMapper;
import com.codefish.server.pojo.Menu;
import com.codefish.server.service.IMenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyf
 * @since 2022-03-15
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
