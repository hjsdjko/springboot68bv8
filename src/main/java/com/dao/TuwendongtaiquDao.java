package com.dao;

import com.entity.TuwendongtaiquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuwendongtaiquVO;
import com.entity.view.TuwendongtaiquView;


/**
 * 图文动态区
 * 
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface TuwendongtaiquDao extends BaseMapper<TuwendongtaiquEntity> {
	
	List<TuwendongtaiquVO> selectListVO(@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);
	
	TuwendongtaiquVO selectVO(@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);
	
	List<TuwendongtaiquView> selectListView(@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);

	List<TuwendongtaiquView> selectListView(Pagination page,@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);
	
	TuwendongtaiquView selectView(@Param("ew") Wrapper<TuwendongtaiquEntity> wrapper);
	
}
