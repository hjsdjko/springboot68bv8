package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipindongtaiquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipindongtaiquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipindongtaiquView;


/**
 * 视频动态区
 *
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface ShipindongtaiquService extends IService<ShipindongtaiquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipindongtaiquVO> selectListVO(Wrapper<ShipindongtaiquEntity> wrapper);
   	
   	ShipindongtaiquVO selectVO(@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);
   	
   	List<ShipindongtaiquView> selectListView(Wrapper<ShipindongtaiquEntity> wrapper);
   	
   	ShipindongtaiquView selectView(@Param("ew") Wrapper<ShipindongtaiquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipindongtaiquEntity> wrapper);
   	
}

