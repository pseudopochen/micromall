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
public class OmsOrderReturnApply extends Model<OmsOrderReturnApply> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * order_id
     */
    private Long orderId;

    private Long skuId;

    private String orderSn;

    private LocalDateTime createTime;

    private String memberUsername;

    private BigDecimal returnAmount;

    private String returnName;

    private String returnPhone;

    private Boolean status;

    private LocalDateTime handleTime;

    private String skuImg;

    private String skuName;

    private String skuBrand;

    private String skuAttrsVals;

    private Integer skuCount;

    private BigDecimal skuPrice;

    private BigDecimal skuRealPrice;

    /**
     * ԭ
     */
    private String reason;

    private String description;

    /**
     * ƾ֤ͼƬ
     */
    private String descPics;

    private String handleNote;

    private String handleMan;

    private String receiveMan;

    private LocalDateTime receiveTime;

    private String receiveNote;

    private String receivePhone;

    private String companyAddress;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
