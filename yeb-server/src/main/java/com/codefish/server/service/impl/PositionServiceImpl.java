package com.codefish.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codefish.server.mapper.PositionMapper;
import com.codefish.server.pojo.Position;
import com.codefish.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
