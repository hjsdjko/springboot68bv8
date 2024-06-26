package com.entity.view;

import com.entity.ShipindongtaiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频动态区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
@TableName("shipindongtaiqu")
public class ShipindongtaiquView  extends ShipindongtaiquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipindongtaiquView(){
	}
 
 	public ShipindongtaiquView(ShipindongtaiquEntity shipindongtaiquEntity){
 	try {
			BeanUtils.copyProperties(this, shipindongtaiquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
