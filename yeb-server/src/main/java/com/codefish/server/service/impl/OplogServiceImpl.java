package com.codefish.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codefish.server.mapper.OplogMapper;
import com.codefish.server.pojo.Oplog;
import com.codefish.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
