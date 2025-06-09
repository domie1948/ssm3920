package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学生
 *
 * @author 
 * @email
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 学号
     */
    @TableField(value = "yonghu_xuehao")

    private String yonghuXuehao;


    /**
     * 学生姓名
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 身份证号
     */
    @TableField(value = "yonghu_id_number")

    private String yonghuIdNumber;


    /**
     * 手机号
     */
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 出生日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "chusheng_time",fill = FieldFill.UPDATE)

    private Date chushengTime;


    /**
     * 入校日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "ruxiao_time",fill = FieldFill.UPDATE)

    private Date ruxiaoTime;


    /**
     * 民族
     */
    @TableField(value = "yonghu_minzhu")

    private String yonghuMinzhu;


    /**
     * 籍贯
     */
    @TableField(value = "yonghu_jiguan")

    private String yonghuJiguan;


    /**
     * 所在院系
     */
    @TableField(value = "yonghu_yuanxi")

    private String yonghuYuanxi;


    /**
     * 职务
     */
    @TableField(value = "yonghu_zhiwu")

    private String yonghuZhiwu;


    /**
     * 邮箱
     */
    @TableField(value = "yonghu_email")

    private String yonghuEmail;


    /**
     * 照片
     */
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：学号
	 */
    public String getYonghuXuehao() {
        return yonghuXuehao;
    }


    /**
	 * 获取：学号
	 */

    public void setYonghuXuehao(String yonghuXuehao) {
        this.yonghuXuehao = yonghuXuehao;
    }
    /**
	 * 设置：学生姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：学生姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：出生日期
	 */
    public Date getChushengTime() {
        return chushengTime;
    }


    /**
	 * 获取：出生日期
	 */

    public void setChushengTime(Date chushengTime) {
        this.chushengTime = chushengTime;
    }
    /**
	 * 设置：入校日期
	 */
    public Date getRuxiaoTime() {
        return ruxiaoTime;
    }


    /**
	 * 获取：入校日期
	 */

    public void setRuxiaoTime(Date ruxiaoTime) {
        this.ruxiaoTime = ruxiaoTime;
    }
    /**
	 * 设置：民族
	 */
    public String getYonghuMinzhu() {
        return yonghuMinzhu;
    }


    /**
	 * 获取：民族
	 */

    public void setYonghuMinzhu(String yonghuMinzhu) {
        this.yonghuMinzhu = yonghuMinzhu;
    }
    /**
	 * 设置：籍贯
	 */
    public String getYonghuJiguan() {
        return yonghuJiguan;
    }


    /**
	 * 获取：籍贯
	 */

    public void setYonghuJiguan(String yonghuJiguan) {
        this.yonghuJiguan = yonghuJiguan;
    }
    /**
	 * 设置：所在院系
	 */
    public String getYonghuYuanxi() {
        return yonghuYuanxi;
    }


    /**
	 * 获取：所在院系
	 */

    public void setYonghuYuanxi(String yonghuYuanxi) {
        this.yonghuYuanxi = yonghuYuanxi;
    }
    /**
	 * 设置：职务
	 */
    public String getYonghuZhiwu() {
        return yonghuZhiwu;
    }


    /**
	 * 获取：职务
	 */

    public void setYonghuZhiwu(String yonghuZhiwu) {
        this.yonghuZhiwu = yonghuZhiwu;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 设置：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yonghuXuehao=" + yonghuXuehao +
            ", yonghuName=" + yonghuName +
            ", sexTypes=" + sexTypes +
            ", yonghuIdNumber=" + yonghuIdNumber +
            ", yonghuPhone=" + yonghuPhone +
            ", chushengTime=" + chushengTime +
            ", ruxiaoTime=" + ruxiaoTime +
            ", yonghuMinzhu=" + yonghuMinzhu +
            ", yonghuJiguan=" + yonghuJiguan +
            ", yonghuYuanxi=" + yonghuYuanxi +
            ", yonghuZhiwu=" + yonghuZhiwu +
            ", yonghuEmail=" + yonghuEmail +
            ", yonghuPhoto=" + yonghuPhoto +
            ", createTime=" + createTime +
        "}";
    }
}
