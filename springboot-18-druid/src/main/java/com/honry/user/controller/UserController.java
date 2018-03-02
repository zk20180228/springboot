package com.honry.user.controller;

import com.honry.bean.TbUser;
import com.honry.mapper.TbUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/2/1 14:12
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Api("用户管理的控制中心")
@RequestMapping("user")
@RestController
public class UserController {

    @Resource
    private TbUserMapper tbUserMapper;

    @ApiOperation(value="根据id查询用户",notes = "目前只有id=37有值")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType ="path",name = "id",value = "用户表id(主键)",required = true,dataType = "Integer")
            })
    @RequestMapping(value="findById/{id}",method = RequestMethod.GET)
    public TbUser findById(@PathVariable("id") Integer id){

        return tbUserMapper.findById(id);
    }

}
