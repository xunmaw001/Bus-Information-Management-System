package com.entity.view;

import com.entity.GongjiaoxianluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 公交线路
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongjiaoxianlu")
public class GongjiaoxianluView extends GongjiaoxianluEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 线路类型的值
		*/
		private String gongjiaoxianluValue;



	public GongjiaoxianluView() {

	}

	public GongjiaoxianluView(GongjiaoxianluEntity gongjiaoxianluEntity) {
		try {
			BeanUtils.copyProperties(this, gongjiaoxianluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 线路类型的值
			*/
			public String getGongjiaoxianluValue() {
				return gongjiaoxianluValue;
			}
			/**
			* 设置： 线路类型的值
			*/
			public void setGongjiaoxianluValue(String gongjiaoxianluValue) {
				this.gongjiaoxianluValue = gongjiaoxianluValue;
			}











}
