package com.luban.micromall.coupon.entity;

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
public class SmsHomeSubject extends Model<SmsHomeSubject> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * ר
     */
    private String name;

    /**
     * ר
     */
    private String title;

    /**
     * ר
     */
    private String subTitle;

    private Boolean status;

    private String url;

    private Integer sort;

    /**
     * ר
     */
    private String img;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
