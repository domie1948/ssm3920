package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 学号
     */
    private String yonghuXuehao;


    /**
     * 学生姓名
     */
    private String yonghuName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 身份证号
     */
    private String yonghuIdNumber;


    /**
     * 手机号
     */
    private String yonghuPhone;


    /**
     * 出生日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date chushengTime;


    /**
     * 入校日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学号
	 */
    public String getYonghuXuehao() {
        return yonghuXuehao;
    }


    /**
	 * 设置：学号
	 */
    public void setYonghuXuehao(String yonghuXuehao) {
        this.yonghuXuehao = yonghuXuehao;
    }
    /**
	 * 获取：学生姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：学生姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：出生日期
	 */
    public Date getChushengTime() {
        return chushengTime;
    }


    /**
	 * 设置：出生日期
	 */
    public void setChushengTime(Date chushengTime) {
        this.chushengTime = chushengTime;
    }
    /**
	 * 获取：入校日期
	 */
    public Date getRuxiaoTime() {
        return ruxiaoTime;
    }


    /**
	 * 设置：入校日期
	 */
    public void setRuxiaoTime(Date ruxiaoTime) {
        this.ruxiaoTime = ruxiaoTime;
    }
    /**
	 * 获取：民族
	 */
    public String getYonghuMinzhu() {
        return yonghuMinzhu;
    }


    /**
	 * 设置：民族
	 */
    public void setYonghuMinzhu(String yonghuMinzhu) {
        this.yonghuMinzhu = yonghuMinzhu;
    }
    /**
	 * 获取：籍贯
	 */
    public String getYonghuJiguan() {
        return yonghuJiguan;
    }


    /**
	 * 设置：籍贯
	 */
    public void setYonghuJiguan(String yonghuJiguan) {
        this.yonghuJiguan = yonghuJiguan;
    }
    /**
	 * 获取：所在院系
	 */
    public String getYonghuYuanxi() {
        return yonghuYuanxi;
    }


    /**
	 * 设置：所在院系
	 */
    public void setYonghuYuanxi(String yonghuYuanxi) {
        this.yonghuYuanxi = yonghuYuanxi;
    }
    /**
	 * 获取：职务
	 */
    public String getYonghuZhiwu() {
        return yonghuZhiwu;
    }


    /**
	 * 设置：职务
	 */
    public void setYonghuZhiwu(String yonghuZhiwu) {
        this.yonghuZhiwu = yonghuZhiwu;
    }
    /**
	 * 获取：邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
