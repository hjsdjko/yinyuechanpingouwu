package com.entity.vo;

import com.entity.ChangpianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("changpian_order")
public class ChangpianOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "changpian_order_uuid_number")
    private String changpianOrderUuidNumber;


    /**
     * 收货地址
     */

    @TableField(value = "address_id")
    private Integer addressId;


    /**
     * 商品
     */

    @TableField(value = "changpian_id")
    private Integer changpianId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "changpian_order_true_price")
    private Double changpianOrderTruePrice;


    /**
     * 订单类型
     */

    @TableField(value = "changpian_order_types")
    private Integer changpianOrderTypes;


    /**
     * 快递公司
     */

    @TableField(value = "changpian_order_courier_name")
    private String changpianOrderCourierName;


    /**
     * 快递单号
     */

    @TableField(value = "changpian_order_courier_number")
    private String changpianOrderCourierNumber;


    /**
     * 支付类型
     */

    @TableField(value = "changpian_order_payment_types")
    private Integer changpianOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 设置：订单号
	 */
    public String getChangpianOrderUuidNumber() {
        return changpianOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setChangpianOrderUuidNumber(String changpianOrderUuidNumber) {
        this.changpianOrderUuidNumber = changpianOrderUuidNumber;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 获取：收货地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：商品
	 */
    public Integer getChangpianId() {
        return changpianId;
    }


    /**
	 * 获取：商品
	 */

    public void setChangpianId(Integer changpianId) {
        this.changpianId = changpianId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getChangpianOrderTruePrice() {
        return changpianOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setChangpianOrderTruePrice(Double changpianOrderTruePrice) {
        this.changpianOrderTruePrice = changpianOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getChangpianOrderTypes() {
        return changpianOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setChangpianOrderTypes(Integer changpianOrderTypes) {
        this.changpianOrderTypes = changpianOrderTypes;
    }
    /**
	 * 设置：快递公司
	 */
    public String getChangpianOrderCourierName() {
        return changpianOrderCourierName;
    }


    /**
	 * 获取：快递公司
	 */

    public void setChangpianOrderCourierName(String changpianOrderCourierName) {
        this.changpianOrderCourierName = changpianOrderCourierName;
    }
    /**
	 * 设置：快递单号
	 */
    public String getChangpianOrderCourierNumber() {
        return changpianOrderCourierNumber;
    }


    /**
	 * 获取：快递单号
	 */

    public void setChangpianOrderCourierNumber(String changpianOrderCourierNumber) {
        this.changpianOrderCourierNumber = changpianOrderCourierNumber;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getChangpianOrderPaymentTypes() {
        return changpianOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setChangpianOrderPaymentTypes(Integer changpianOrderPaymentTypes) {
        this.changpianOrderPaymentTypes = changpianOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
