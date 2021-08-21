package com.luban.micromall.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class OmsRefundInfo extends Model<OmsRefundInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long orderReturnId;

    private BigDecimal refund;

    private String refundSn;

    private Boolean refundStatus;

    private Integer refundChannel;

    private String refundContent;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
