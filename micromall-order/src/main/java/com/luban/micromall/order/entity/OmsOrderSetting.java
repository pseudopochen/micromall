package com.luban.micromall.order.entity;

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
public class OmsOrderSetting extends Model<OmsOrderSetting> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer flashOrderOvertime;

    private Integer normalOrderOvertime;

    private Integer confirmOvertime;

    private Integer finishOvertime;

    private Integer commentOvertime;

    private Integer memberLevel;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
