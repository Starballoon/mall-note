package com.macro.mall.dao;

import com.macro.mall.model.CmsPreferenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优选和商品关系自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface CmsPreferenceAreaProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsPreferenceAreaProductRelation> prefrenceAreaProductRelationList);
}
