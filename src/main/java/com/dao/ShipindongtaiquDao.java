package com.dao;

import com.entity.ShipindongtaiquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipindongtaiquVO;
import com.entity.view.ShipindongtaiquView;


/**
 * 视频动态区
 * 
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface ShipindongtaiquDao extends BaseMapper<ShipindongtaiquEntity> {
	
	List<ShipindongtaiquVO> selectListVO(@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);
	
	ShipindongtaiquVO selectVO(@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);
	
	List<ShipindongtaiquView> selectListView(@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);

	List<ShipindongtaiquView> selectListView(Pagination page,@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);
	
	ShipindongtaiquView selectView(@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);
	
}
