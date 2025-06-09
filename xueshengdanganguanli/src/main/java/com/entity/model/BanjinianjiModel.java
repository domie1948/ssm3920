package com.entity.model;

import com.entity.BanjinianjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 班级/年级
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BanjinianjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 记录编号
     */
    private String banjinianjiBianhao;


    /**
     * 年级
     */
    private String banjinianjiDizhi;


    /**
     * 班级
     */
    private String banjinianjiFuzeren;


    /**
     * 详情信息
     */
    private String banjinianjiContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：记录编号
	 */
    public String getBanjinianjiBianhao() {
        return banjinianjiBianhao;
    }


    /**
	 * 设置：记录编号
	 */
    public void setBanjinianjiBianhao(String banjinianjiBianhao) {
        this.banjinianjiBianhao = banjinianjiBianhao;
    }
    /**
	 * 获取：年级
	 */
    public String getBanjinianjiDizhi() {
        return banjinianjiDizhi;
    }


    /**
	 * 设置：年级
	 */
    public void setBanjinianjiDizhi(String banjinianjiDizhi) {
        this.banjinianjiDizhi = banjinianjiDizhi;
    }
    /**
	 * 获取：班级
	 */
    public String getBanjinianjiFuzeren() {
        return banjinianjiFuzeren;
    }


    /**
	 * 设置：班级
	 */
    public void setBanjinianjiFuzeren(String banjinianjiFuzeren) {
        this.banjinianjiFuzeren = banjinianjiFuzeren;
    }
    /**
	 * 获取：详情信息
	 */
    public String getBanjinianjiContent() {
        return banjinianjiContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setBanjinianjiContent(String banjinianjiContent) {
        this.banjinianjiContent = banjinianjiContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上传时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
