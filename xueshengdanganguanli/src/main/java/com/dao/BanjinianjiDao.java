package com.dao;

import com.entity.BanjinianjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjinianjiView;

/**
 * 班级/年级 Dao 接口
 *
 * @author 
 */
public interface BanjinianjiDao extends BaseMapper<BanjinianjiEntity> {

   List<BanjinianjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
