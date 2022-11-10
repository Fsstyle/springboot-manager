package com.company.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.company.project.entity.BaseEntity;


import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 房屋表
 *
 * @author wenbin
 * @email *****@mail.com
 * @date 2022-11-10 10:52:14
 */
@Data
@TableName("d_house")
public class DHouseEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId("house_id")
	private Integer houseId;

	/**
	 * 房屋编号
	 */
	@TableField("house_no")
	private String houseNo;

	/**
	 * 楼栋号
	 */
	@TableField("block_no")
	private String blockNo;

	/**
	 * 业主
	 */
	@TableField("buyer_name")
	private String buyerName;

	/**
	 * 状态
	 */
	@TableField("status")
	private String status;

	/**
	 * 购买时间
	 */
	@TableField("buy_time")
	private Date buyTime;

	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@TableField("update_time")
	private Date updateTime;

	/**
	 * 业主电话
	 */
	@TableField("buyer_phone")
	private String buyerPhone;


}
