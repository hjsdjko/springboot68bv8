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


import com.dao.HuodongpiaoquanDao;
import com.entity.HuodongpiaoquanEntity;
import com.service.HuodongpiaoquanService;
import com.entity.vo.HuodongpiaoquanVO;
import com.entity.view.HuodongpiaoquanView;

@Service("huodongpiaoquanService")
public class HuodongpiaoquanServiceImpl extends ServiceImpl<HuodongpiaoquanDao, HuodongpiaoquanEntity> implements HuodongpiaoquanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongpiaoquanEntity> page = this.selectPage(
                new Query<HuodongpiaoquanEntity>(params).getPage(),
                new EntityWrapper<HuodongpiaoquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongpiaoquanEntity> wrapper) {
		  Page<HuodongpiaoquanView> page =new Query<HuodongpiaoquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongpiaoquanVO> selectListVO(Wrapper<HuodongpiaoquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongpiaoquanVO selectVO(Wrapper<HuodongpiaoquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongpiaoquanView> selectListView(Wrapper<HuodongpiaoquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongpiaoquanView selectView(Wrapper<HuodongpiaoquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
