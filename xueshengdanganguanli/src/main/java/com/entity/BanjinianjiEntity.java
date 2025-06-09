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
 * 班级/年级
 *
 * @author 
 * @email
 */
@TableName("banjinianji")
public class BanjinianjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BanjinianjiEntity() {

	}

	public BanjinianjiEntity(T t) {
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
     * 记录编号
     */
    @TableField(value = "banjinianji_bianhao")

    private String banjinianjiBianhao;


    /**
     * 年级
     */
    @TableField(value = "banjinianji_dizhi")

    private String banjinianjiDizhi;


    /**
     * 班级
     */
    @TableField(value = "banjinianji_fuzeren")

    private String banjinianjiFuzeren;


    /**
     * 详情信息
     */
    @TableField(value = "banjinianji_content")

    private String banjinianjiContent;


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
	 * 设置：记录编号
	 */
    public String getBanjinianjiBianhao() {
        return banjinianjiBianhao;
    }


    /**
	 * 获取：记录编号
	 */

    public void setBanjinianjiBianhao(String banjinianjiBianhao) {
        this.banjinianjiBianhao = banjinianjiBianhao;
    }
    /**
	 * 设置：年级
	 */
    public String getBanjinianjiDizhi() {
        return banjinianjiDizhi;
    }


    /**
	 * 获取：年级
	 */

    public void setBanjinianjiDizhi(String banjinianjiDizhi) {
        this.banjinianjiDizhi = banjinianjiDizhi;
    }
    /**
	 * 设置：班级
	 */
    public String getBanjinianjiFuzeren() {
        return banjinianjiFuzeren;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjinianjiFuzeren(String banjinianjiFuzeren) {
        this.banjinianjiFuzeren = banjinianjiFuzeren;
    }
    /**
	 * 设置：详情信息
	 */
    public String getBanjinianjiContent() {
        return banjinianjiContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setBanjinianjiContent(String banjinianjiContent) {
        this.banjinianjiContent = banjinianjiContent;
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
        return "Banjinianji{" +
            "id=" + id +
            ", banjinianjiBianhao=" + banjinianjiBianhao +
            ", banjinianjiDizhi=" + banjinianjiDizhi +
            ", banjinianjiFuzeren=" + banjinianjiFuzeren +
            ", banjinianjiContent=" + banjinianjiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
