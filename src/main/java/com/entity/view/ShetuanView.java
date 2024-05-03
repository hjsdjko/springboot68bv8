package com.entity.view;

import com.entity.ShetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
@TableName("shetuan")
public class ShetuanView  extends ShetuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanView(){
	}
 
 	public ShetuanView(ShetuanEntity shetuanEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
