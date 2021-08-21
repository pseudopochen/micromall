package com.luban.micromall.ware.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品库存
 * </p>
 *
 * @author pochen
 * @since 2021-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WmsWareSku extends Model<WmsWareSku> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 仓库id
     */
    private Long wareId;

    /**
     * 库存数
     */
    private Integer stock;

    /**
     * sku_name
     */
    private String skuName;

    /**
     * 锁定库存
     */
    private Integer stockLocked;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
