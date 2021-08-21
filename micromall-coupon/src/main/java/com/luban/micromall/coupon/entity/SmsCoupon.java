package com.luban.micromall.coupon.entity;

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
public class SmsCoupon extends Model<SmsCoupon> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Boolean couponType;

    private String couponImg;

    private String couponName;

    private Integer num;

    private BigDecimal amount;

    /**
     * ÿ
     */
    private Integer perLimit;

    /**
     * ʹ
     */
    private BigDecimal minPoint;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    /**
     * ʹ
     */
    private Boolean useType;

    private String note;

    private Integer publishCount;

    private Integer useCount;

    private Integer receiveCount;

    private LocalDateTime enableStartTime;

    private LocalDateTime enableEndTime;

    private String code;

    private Boolean memberLevel;

    private Boolean publish;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
