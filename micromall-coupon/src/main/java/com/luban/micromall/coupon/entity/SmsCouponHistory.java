package com.luban.micromall.coupon.entity;

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
public class SmsCouponHistory extends Model<SmsCouponHistory> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long couponId;

    private Long memberId;

    private String memberNickName;

    private Boolean getType;

    private LocalDateTime createTime;

    /**
     * ʹ
     */
    private Boolean useType;

    /**
     * ʹ
     */
    private LocalDateTime useTime;

    private Long orderId;

    private Long orderSn;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
