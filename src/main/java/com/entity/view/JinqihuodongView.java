package com.entity.view;

import com.entity.JinqihuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 近期活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
@TableName("jinqihuodong")
public class JinqihuodongView  extends JinqihuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinqihuodongView(){
	}
 
 	public JinqihuodongView(JinqihuodongEntity jinqihuodongEntity){
 	try {
			BeanUtils.copyProperties(this, jinqihuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
