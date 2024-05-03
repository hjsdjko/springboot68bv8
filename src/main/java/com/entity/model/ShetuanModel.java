package com.entity.model;

import com.entity.ShetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 社团
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-18 23:12:38
 */
public class ShetuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 成员
	 */
	
	private String chengyuan;
		
	/**
	 * 创建时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangjianshijian;
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：成员
	 */
	 
	public void setChengyuan(String chengyuan) {
		this.chengyuan = chengyuan;
	}
	
	/**
	 * 获取：成员
	 */
	public String getChengyuan() {
		return chengyuan;
	}
				
	
	/**
	 * 设置：创建时间
	 */
	 
	public void setChuangjianshijian(Date chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	
	/**
	 * 获取：创建时间
	 */
	public Date getChuangjianshijian() {
		return chuangjianshijian;
	}
			
}
