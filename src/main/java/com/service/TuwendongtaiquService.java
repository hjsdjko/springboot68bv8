package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuwendongtaiquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuwendongtaiquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuwendongtaiquView;


/**
 * 图文动态区
 *
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface TuwendongtaiquService extends IService<TuwendongtaiquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuwendongtaiquVO> selectListVO(Wrapper<TuwendongtaiquEntity> wrapper);
   	
   	TuwendongtaiquVO selectVO(@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);
   	
   	List<TuwendongtaiquView> selectListView(Wrapper<TuwendongtaiquEntity> wrapper);
   	
   	TuwendongtaiquView selectView(@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuwendongtaiquEntity> wrapper);
   	
}

