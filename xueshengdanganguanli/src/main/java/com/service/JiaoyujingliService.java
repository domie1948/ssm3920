package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyujingliEntity;
import java.util.Map;

/**
 * 教育经历 服务类
 */
public interface JiaoyujingliService extends IService<JiaoyujingliEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}