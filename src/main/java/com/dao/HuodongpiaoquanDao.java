package com.dao;

import com.entity.HuodongpiaoquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongpiaoquanVO;
import com.entity.view.HuodongpiaoquanView;


/**
 * 活动票券
 * 
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface HuodongpiaoquanDao extends BaseMapper<HuodongpiaoquanEntity> {
	
	List<HuodongpiaoquanVO> selectListVO(@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);
	
	HuodongpiaoquanVO selectVO(@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);
	
	List<HuodongpiaoquanView> selectListView(@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);

	List<HuodongpiaoquanView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);
	
	HuodongpiaoquanView selectView(@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);
	
}
