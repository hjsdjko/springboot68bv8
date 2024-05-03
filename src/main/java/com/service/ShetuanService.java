package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanView;


/**
 * 社团
 *
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface ShetuanService extends IService<ShetuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanVO> selectListVO(Wrapper<ShetuanEntity> wrapper);
   	
   	ShetuanVO selectVO(@Param("ew") Wrapper<ShetuanEntity> wrapper);
   	
   	List<ShetuanView> selectListView(Wrapper<ShetuanEntity> wrapper);
   	
   	ShetuanView selectView(@Param("ew") Wrapper<ShetuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanEntity> wrapper);
   	
}

