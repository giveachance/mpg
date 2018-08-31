package com.hqh.mp.service.impl;

import com.hqh.mp.beans.User;
import com.hqh.mp.mapper.UserMapper;
import com.hqh.mp.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
