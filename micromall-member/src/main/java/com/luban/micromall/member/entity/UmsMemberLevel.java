package com.luban.micromall.member.entity;

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
public class UmsMemberLevel extends Model<UmsMemberLevel> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer growthPoint;

    private Integer defaultStatus;

    private BigDecimal freeFreightPoint;

    /**
     * ÿ
     */
    private Integer commentGrowthPoint;

    private Integer priviledgeFreeFreight;

    private Integer priviledgeMemberPrice;

    private Integer priviledgeBirthday;

    private String note;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
