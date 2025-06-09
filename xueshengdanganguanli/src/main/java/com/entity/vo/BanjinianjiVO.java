package com.entity.vo;

import com.entity.BanjinianjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 班级/年级
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("banjinianji")
public class BanjinianjiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
