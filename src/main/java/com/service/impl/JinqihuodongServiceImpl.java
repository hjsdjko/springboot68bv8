package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JinqihuodongDao;
import com.entity.JinqihuodongEntity;
import com.service.JinqihuodongService;
import com.entity.vo.JinqihuodongVO;
import com.entity.view.JinqihuodongView;

@Service("jinqihuodongService")
public class JinqihuodongServiceImpl extends ServiceImpl<JinqihuodongDao, JinqihuodongEntity> implements JinqihuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinqihuodongEntity> page = this.selectPage(
                new Query<JinqihuodongEntity>(params).getPage(),
                new EntityWrapper<JinqihuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinqihuodongEntity> wrapper) {
		  Page<JinqihuodongView> page =new Query<JinqihuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinqihuodongVO> selectListVO(Wrapper<JinqihuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinqihuodongVO selectVO(Wrapper<JinqihuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinqihuodongView> selectListView(Wrapper<JinqihuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinqihuodongView selectView(Wrapper<JinqihuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
