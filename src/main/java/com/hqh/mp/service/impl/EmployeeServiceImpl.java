package com.hqh.mp.service.impl;

import com.hqh.mp.beans.Employee;
import com.hqh.mp.mapper.EmployeeMapper;
import com.hqh.mp.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hqh
 * @since 2018-08-31
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
