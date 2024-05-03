package com.dao;

import com.entity.ShetuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanVO;
import com.entity.view.ShetuanView;


/**
 * 社团
 * 
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface ShetuanDao extends BaseMapper<ShetuanEntity> {
	
	List<ShetuanVO> selectListVO(@Param("ew") Wrapper<ShetuanEntity> wrapper);
	
	ShetuanVO selectVO(@Param("ew") Wrapper<ShetuanEntity> wrapper);
	
	List<ShetuanView> selectListView(@Param("ew") Wrapper<ShetuanEntity> wrapper);

	List<ShetuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanEntity> wrapper);
	
	ShetuanView selectView(@Param("ew") Wrapper<ShetuanEntity> wrapper);
	
}
