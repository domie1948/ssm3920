package com.entity.view;

import com.entity.DanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 档案信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dangan")
public class DanganView extends DanganEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 档案类型的值
		*/
		private String danganValue;



		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuXuehao;
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 出生日期
			*/
			private Date chushengTime;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 入校日期
			*/
			private Date ruxiaoTime;
			/**
			* 民族
			*/
			private String yonghuMinzhu;
			/**
			* 籍贯
			*/
			private String yonghuJiguan;
			/**
			* 所在院系
			*/
			private String yonghuYuanxi;
			/**
			* 职务
			*/
			private String yonghuZhiwu;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public DanganView() {

	}

	public DanganView(DanganEntity danganEntity) {
		try {
			BeanUtils.copyProperties(this, danganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 档案类型的值
			*/
			public String getDanganValue() {
				return danganValue;
			}
			/**
			* 设置： 档案类型的值
			*/
			public void setDanganValue(String danganValue) {
				this.danganValue = danganValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuXuehao() {
						return yonghuXuehao;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuXuehao(String yonghuXuehao) {
						this.yonghuXuehao = yonghuXuehao;
					}
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 出生日期
					*/
					public Date getChushengTime() {
						return chushengTime;
					}
					/**
					* 设置： 出生日期
					*/
					public void setChushengTime(Date chushengTime) {
						this.chushengTime = chushengTime;
					}
					/**
					* 获取： 入校日期
					*/
					public Date getRuxiaoTime() {
						return ruxiaoTime;
					}
					/**
					* 设置： 入校日期
					*/
					public void setRuxiaoTime(Date ruxiaoTime) {
						this.ruxiaoTime = ruxiaoTime;
					}
					/**
					* 获取： 民族
					*/
					public String getYonghuMinzhu() {
						return yonghuMinzhu;
					}
					/**
					* 设置： 民族
					*/
					public void setYonghuMinzhu(String yonghuMinzhu) {
						this.yonghuMinzhu = yonghuMinzhu;
					}
					/**
					* 获取： 籍贯
					*/
					public String getYonghuJiguan() {
						return yonghuJiguan;
					}
					/**
					* 设置： 籍贯
					*/
					public void setYonghuJiguan(String yonghuJiguan) {
						this.yonghuJiguan = yonghuJiguan;
					}
					/**
					* 获取： 所在院系
					*/
					public String getYonghuYuanxi() {
						return yonghuYuanxi;
					}
					/**
					* 设置： 所在院系
					*/
					public void setYonghuYuanxi(String yonghuYuanxi) {
						this.yonghuYuanxi = yonghuYuanxi;
					}
					/**
					* 获取： 职务
					*/
					public String getYonghuZhiwu() {
						return yonghuZhiwu;
					}
					/**
					* 设置： 职务
					*/
					public void setYonghuZhiwu(String yonghuZhiwu) {
						this.yonghuZhiwu = yonghuZhiwu;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}


}
