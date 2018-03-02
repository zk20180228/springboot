package com.honry.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/17 9:31
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Repository
public class RedisTest{


    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key,String value){
        ValueOperations<String, String> valueOperations =
                stringRedisTemplate.opsForValue();

        if(!this.stringRedisTemplate.hasKey(key)){
            valueOperations.set(key,value);
            System.out.println("set string success!");
        }else{
            System.out.println("key已存在="+valueOperations.get(key));
        }

    }

    public String get(String key){

        return this.stringRedisTemplate.opsForValue().get(key);
    }


    public void del(String key){

        this.stringRedisTemplate.delete(key);
    }



}
