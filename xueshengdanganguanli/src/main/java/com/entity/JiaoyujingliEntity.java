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
 * 教育经历
 *
 * @author 
 * @email
 */
@TableName("jiaoyujingli")
public class JiaoyujingliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoyujingliEntity() {

	}

	public JiaoyujingliEntity(T t) {
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
     * 编号
     */
    @TableField(value = "jiaoyujingli_bianhao")

    private String jiaoyujingliBianhao;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 开始日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaishi_time",fill = FieldFill.UPDATE)

    private Date kaishiTime;


    /**
     * 终止日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jieshu_time",fill = FieldFill.UPDATE)

    private Date jieshuTime;


    /**
     * 职务
     */
    @TableField(value = "jiaoyujingli_types")

    private Integer jiaoyujingliTypes;


    /**
     * 详情信息
     */
    @TableField(value = "jiaoyujingli_content")

    private String jiaoyujingliContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：编号
	 */
    public String getJiaoyujingliBianhao() {
        return jiaoyujingliBianhao;
    }


    /**
	 * 获取：编号
	 */

    public void setJiaoyujingliBianhao(String jiaoyujingliBianhao) {
        this.jiaoyujingliBianhao = jiaoyujingliBianhao;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：开始日期
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 获取：开始日期
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 设置：终止日期
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：终止日期
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：职务
	 */
    public Integer getJiaoyujingliTypes() {
        return jiaoyujingliTypes;
    }


    /**
	 * 获取：职务
	 */

    public void setJiaoyujingliTypes(Integer jiaoyujingliTypes) {
        this.jiaoyujingliTypes = jiaoyujingliTypes;
    }
    /**
	 * 设置：详情信息
	 */
    public String getJiaoyujingliContent() {
        return jiaoyujingliContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setJiaoyujingliContent(String jiaoyujingliContent) {
        this.jiaoyujingliContent = jiaoyujingliContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Jiaoyujingli{" +
            "id=" + id +
            ", jiaoyujingliBianhao=" + jiaoyujingliBianhao +
            ", yonghuId=" + yonghuId +
            ", kaishiTime=" + kaishiTime +
            ", jieshuTime=" + jieshuTime +
            ", jiaoyujingliTypes=" + jiaoyujingliTypes +
            ", jiaoyujingliContent=" + jiaoyujingliContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
