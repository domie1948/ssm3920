package com.entity.vo;

import com.entity.JiaoyujingliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教育经历
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoyujingli")
public class JiaoyujingliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "kaishi_time")
    private Date kaishiTime;


    /**
     * 终止日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jieshu_time")
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

}
