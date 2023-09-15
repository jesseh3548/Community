package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    /*
    * 如果某个类属于某个外部库而你无法使用@Component进行注释，
    * 你必须在自定义bean的配置类中使用@Bean注释创建工厂方法。
    * 如果你不想使类依赖于Spring，你也可以将此选项用于你拥有的类。
    * */
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
