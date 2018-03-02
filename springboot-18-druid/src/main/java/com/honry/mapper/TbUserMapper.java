package com.honry.mapper;

import com.honry.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:用户mapper
 * @Author: zhangkui
 * @CreateDate: 2018/2/1 10:26
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Mapper
public interface TbUserMapper {

     TbUser findById(@Param("id") Integer id);


}
