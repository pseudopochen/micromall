package com.luban.micromall.coupon.entity;

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
public class SmsSpuBounds extends Model<SmsSpuBounds> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long spuId;

    private BigDecimal growBounds;

    private BigDecimal buyBounds;

    private Boolean work;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
