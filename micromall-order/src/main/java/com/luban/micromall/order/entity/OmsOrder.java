package com.luban.micromall.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author pochen
 * @since 2021-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmsOrder extends Model<OmsOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * member_id
     */
    private Long memberId;

    private String orderSn;

    /**
     * ʹ
     */
    private Long couponId;

    /**
     * create_time
     */
    private LocalDateTime createTime;

    private String memberUsername;

    private BigDecimal totalAmount;

    /**
     * Ӧ
     */
    private BigDecimal payAmount;

    private BigDecimal freightAmount;

    private BigDecimal promotionAmount;

    private BigDecimal integrationAmount;

    private BigDecimal couponAmount;

    private BigDecimal discountAmount;

    /**
     * ֧
     */
    private Integer payType;

    private Integer sourceType;

    private Integer status;

    private String deliveryCompany;

    private String deliverySn;

    private Integer autoConfirmDay;

    private Integer integration;

    private Integer growth;

    private Integer billType;

    private String billHeader;

    private String billContent;

    private String billReceiverPhone;

    private String billReceiverEmail;

    private String receiverName;

    private String receiverPhone;

    private String receiverPostCode;

    /**
     * ʡ
     */
    private String receiverProvince;

    private String receiverCity;

    private String receiverRegion;

    private String receiverDetailAddress;

    private String note;

    /**
     * ȷ
     */
    private Integer confirmStatus;

    /**
     * ɾ
     */
    private Integer deleteStatus;

    private Integer useIntegration;

    /**
     * ֧
     */
    private LocalDateTime paymentTime;

    private LocalDateTime deliveryTime;

    /**
     * ȷ
     */
    private LocalDateTime receiveTime;

    private LocalDateTime commentTime;

    private LocalDateTime modifyTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
