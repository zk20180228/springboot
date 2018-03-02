package com.honry.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Description: druid连接池访问的过滤器
 * @Author: zhangkui
 * @CreateDate: 2018/2/1 13:50
 * @Modifier: zhangkui
 * @version: V1.0
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
        }
)
public class DruidStatFilter extends WebStatFilter {

}