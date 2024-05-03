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


import com.dao.ShetuanDao;
import com.entity.ShetuanEntity;
import com.service.ShetuanService;
import com.entity.vo.ShetuanVO;
import com.entity.view.ShetuanView;

@Service("shetuanService")
public class ShetuanServiceImpl extends ServiceImpl<ShetuanDao, ShetuanEntity> implements ShetuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanEntity> page = this.selectPage(
                new Query<ShetuanEntity>(params).getPage(),
                new EntityWrapper<ShetuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanEntity> wrapper) {
		  Page<ShetuanView> page =new Query<ShetuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanVO> selectListVO(Wrapper<ShetuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanVO selectVO(Wrapper<ShetuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanView> selectListView(Wrapper<ShetuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanView selectView(Wrapper<ShetuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
