package com.company.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import com.company.project.common.utils.DataResult;

import com.company.project.entity.DHouseEntity;
import com.company.project.service.DHouseService;



/**
 * 房屋表
 *
 * @author wenbin
 * @email *****@mail.com
 * @date 2022-11-10 10:52:14
 */
@Controller
@RequestMapping("/")
public class DHouseController {
    @Autowired
    private DHouseService dHouseService;


    /**
    * 跳转到页面
    */
    @GetMapping("/index/dHouse")
    public String dHouse() {
        return "dhouse/list";
        }

    @ApiOperation(value = "新增")
    @PostMapping("dHouse/add")
    @RequiresPermissions("dHouse:add")
    @ResponseBody
    public DataResult add(@RequestBody DHouseEntity dHouse){
        dHouseService.save(dHouse);
        return DataResult.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("dHouse/delete")
    @RequiresPermissions("dHouse:delete")
    @ResponseBody
    public DataResult delete(@RequestBody @ApiParam(value = "id集合") List<String> ids){
        dHouseService.removeByIds(ids);
        return DataResult.success();
    }

    @ApiOperation(value = "更新")
    @PutMapping("dHouse/update")
    @RequiresPermissions("dHouse:update")
    @ResponseBody
    public DataResult update(@RequestBody DHouseEntity dHouse){
        dHouseService.updateById(dHouse);
        return DataResult.success();
    }

    @ApiOperation(value = "查询分页数据")
    @PostMapping("dHouse/listByPage")
    @RequiresPermissions("dHouse:list")
    @ResponseBody
    public DataResult findListByPage(@RequestBody DHouseEntity dHouse){
        Page page = new Page(dHouse.getPage(), dHouse.getLimit());
        LambdaQueryWrapper<DHouseEntity> queryWrapper = Wrappers.lambdaQuery();
        //查询条件示例
        //queryWrapper.eq(DHouseEntity::getId, dHouse.getId());
        IPage<DHouseEntity> iPage = dHouseService.page(page, queryWrapper);
        return DataResult.success(iPage);
    }

}
