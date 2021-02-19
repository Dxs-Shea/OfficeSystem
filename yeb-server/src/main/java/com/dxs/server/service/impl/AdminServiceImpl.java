package com.dxs.server.service.impl;

import com.dxs.server.pojo.Admin;
import com.dxs.server.mapper.AdminMapper;
import com.dxs.server.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxs
 * @since 2021-02-19
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
