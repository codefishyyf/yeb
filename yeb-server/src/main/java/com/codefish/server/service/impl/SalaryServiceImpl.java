package com.codefish.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codefish.server.mapper.SalaryMapper;
import com.codefish.server.pojo.Salary;
import com.codefish.server.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
