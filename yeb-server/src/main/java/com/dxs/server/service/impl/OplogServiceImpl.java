package com.dxs.server.service.impl;

import com.dxs.server.pojo.Oplog;
import com.dxs.server.mapper.OplogMapper;
import com.dxs.server.service.OplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements OplogService {

}
