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
public class SmsHomeAdv extends Model<SmsHomeAdv> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    /**
     * ͼƬ
     */
    private String pic;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    /**
     * ״̬
     */
    private Boolean status;

    private Integer clickCount;

    private String url;

    private String note;

    private Integer sort;

    private Long publisherId;

    private Long authId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
