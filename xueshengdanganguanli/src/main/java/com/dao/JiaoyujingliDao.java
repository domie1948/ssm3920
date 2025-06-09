package com.dao;

import com.entity.JiaoyujingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyujingliView;

/**
 * 教育经历 Dao 接口
 *
 * @author 
 */
public interface JiaoyujingliDao extends BaseMapper<JiaoyujingliEntity> {

   List<JiaoyujingliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
