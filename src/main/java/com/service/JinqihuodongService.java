package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinqihuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinqihuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinqihuodongView;


/**
 * 近期活动
 *
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public interface JinqihuodongService extends IService<JinqihuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinqihuodongVO> selectListVO(Wrapper<JinqihuodongEntity> wrapper);
   	
   	JinqihuodongVO selectVO(@Param("ew") Wrapper<JinqihuodongEntity> wrapper);
   	
   	List<JinqihuodongView> selectListView(Wrapper<JinqihuodongEntity> wrapper);
   	
   	JinqihuodongView selectView(@Param("ew") Wrapper<JinqihuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinqihuodongEntity> wrapper);
   	
}

