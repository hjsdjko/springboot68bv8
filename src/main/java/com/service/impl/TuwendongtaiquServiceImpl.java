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


import com.dao.TuwendongtaiquDao;
import com.entity.TuwendongtaiquEntity;
import com.service.TuwendongtaiquService;
import com.entity.vo.TuwendongtaiquVO;
import com.entity.view.TuwendongtaiquView;

@Service("tuwendongtaiquService")
public class TuwendongtaiquServiceImpl extends ServiceImpl<TuwendongtaiquDao, TuwendongtaiquEntity> implements TuwendongtaiquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuwendongtaiquEntity> page = this.selectPage(
                new Query<TuwendongtaiquEntity>(params).getPage(),
                new EntityWrapper<TuwendongtaiquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuwendongtaiquEntity> wrapper) {
		  Page<TuwendongtaiquView> page =new Query<TuwendongtaiquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuwendongtaiquVO> selectListVO(Wrapper<TuwendongtaiquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuwendongtaiquVO selectVO(Wrapper<TuwendongtaiquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuwendongtaiquView> selectListView(Wrapper<TuwendongtaiquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuwendongtaiquView selectView(Wrapper<TuwendongtaiquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
