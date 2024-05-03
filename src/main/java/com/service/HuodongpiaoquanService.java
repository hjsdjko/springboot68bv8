package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongpiaoquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongpiaoquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongpiaoquanView;


/**
 * 活动票券
 *
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface HuodongpiaoquanService extends IService<HuodongpiaoquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongpiaoquanVO> selectListVO(Wrapper<HuodongpiaoquanEntity> wrapper);
   	
   	HuodongpiaoquanVO selectVO(@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);
   	
   	List<HuodongpiaoquanView> selectListView(Wrapper<HuodongpiaoquanEntity> wrapper);
   	
   	HuodongpiaoquanView selectView(@Param("ew") Wrapper<HuodongpiaoquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongpiaoquanEntity> wrapper);
   	
}

