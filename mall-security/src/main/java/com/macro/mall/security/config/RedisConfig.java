package com.macro.mall.security.config;

import com.macro.mall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 *
 * @author Starbamboo
 * @date 6/5/2022 1:56 PM
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
