package com.company.project.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.company.project.mapper.DHouseMapper;
import com.company.project.entity.DHouseEntity;
import com.company.project.service.DHouseService;


@Service("dHouseService")
public class DHouseServiceImpl extends ServiceImpl<DHouseMapper, DHouseEntity> implements DHouseService {


}