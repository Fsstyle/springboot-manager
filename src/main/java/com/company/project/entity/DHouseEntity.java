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
 * @date 2022-11-09 16:48:55
 */
@Data
@TableName("d_house")
public class DHouseEntity extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId("house_id")
	private Integer houseId;

	/**
	 * 房屋编号
	 */
	@TableField("house_no")
	private String houseNo;

	/**
	 * $column.comments
	 */
	@TableField("block_no")
	private String blockNo;

	/**
	 * $column.comments
	 */
	@TableField("buyer_name")
	private String buyerName;

	/**
	 * $column.comments
	 */
	@TableField("status")
	private String status;

	/**
	 * $column.comments
	 */
	@TableField("buy_time")
	private Date buyTime;

	/**
	 * $column.comments
	 */
	@TableField("create_time")
	private Date createTime;

	/**
	 * $column.comments
	 */
	@TableField("update_time")
	private Date updateTime;

	/**
	 * $column.comments
	 */
	@TableField("buyer_phone")
	private String buyerPhone;


}
