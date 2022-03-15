package com.codefish.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codefish.server.mapper.DepartmentMapper;
import com.codefish.server.pojo.Department;
import com.codefish.server.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
