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


import com.dao.ShipindongtaiquDao;
import com.entity.ShipindongtaiquEntity;
import com.service.ShipindongtaiquService;
import com.entity.vo.ShipindongtaiquVO;
import com.entity.view.ShipindongtaiquView;

@Service("shipindongtaiquService")
public class ShipindongtaiquServiceImpl extends ServiceImpl<ShipindongtaiquDao, ShipindongtaiquEntity> implements ShipindongtaiquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipindongtaiquEntity> page = this.selectPage(
                new Query<ShipindongtaiquEntity>(params).getPage(),
                new EntityWrapper<ShipindongtaiquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipindongtaiquEntity> wrapper) {
		  Page<ShipindongtaiquView> page =new Query<ShipindongtaiquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipindongtaiquVO> selectListVO(Wrapper<ShipindongtaiquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipindongtaiquVO selectVO(Wrapper<ShipindongtaiquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipindongtaiquView> selectListView(Wrapper<ShipindongtaiquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipindongtaiquView selectView(Wrapper<ShipindongtaiquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
