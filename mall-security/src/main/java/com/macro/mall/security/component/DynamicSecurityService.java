package com.macro.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @author Starbamboo
 * @date 6/5/2022 1:59 PM
 */
public interface DynamicSecurityService {
    /**
     * 加载资源ant通配符和资源对应的Map
     */
    Map<String, ConfigAttribute> loadDataSource();
}
