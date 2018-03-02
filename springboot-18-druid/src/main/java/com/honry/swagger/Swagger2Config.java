package com.honry.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @Description:访问地址：http://localhost:8890/swagger-ui.html
 * @Author: zhangkui
 * @CreateDate: 2018/2/1 15:28
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket accessToken() {

        return new Docket(DocumentationType.SWAGGER_2).groupName("TbUser")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage("com.honry.user.controller")) // 拦截的包路径
                .paths(PathSelectors.any())// 拦截的接口路径//PathSelectors.any()或regex("/user/.*")
                .build() // 创建
                .apiInfo(apiInfo()); // 配置说明
    }


    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()//
                .title("springBoot-Druid")// 标题
                .description("spring boot 全集")// 描述
                .termsOfServiceUrl("http://www.roncoo.com")//
                .contact(new Contact("wujing", "http://www.roncoo.com", "1589022273@qq.com"))// 联系
                //.license("Apache License Version 2.0")// 开源协议
                //.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")// 地址
                .version("1.0")// 版本
                .build();

    }
}
