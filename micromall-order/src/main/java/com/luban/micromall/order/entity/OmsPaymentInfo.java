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
 * ֧
 * </p>
 *
 * @author pochen
 * @since 2021-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmsPaymentInfo extends Model<OmsPaymentInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String orderSn;

    private Long orderId;

    /**
     * ֧
     */
    private String alipayTradeNo;

    /**
     * ֧
     */
    private BigDecimal totalAmount;

    private String subject;

    /**
     * ֧
     */
    private String paymentStatus;

    private LocalDateTime createTime;

    /**
     * ȷ
     */
    private LocalDateTime confirmTime;

    private String callbackContent;

    private LocalDateTime callbackTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
