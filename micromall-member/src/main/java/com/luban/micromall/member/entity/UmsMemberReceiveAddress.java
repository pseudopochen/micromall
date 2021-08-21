package com.luban.micromall.member.entity;

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
public class UmsMemberReceiveAddress extends Model<UmsMemberReceiveAddress> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * member_id
     */
    private Long memberId;

    private String name;

    private String phone;

    private String postCode;

    /**
     * ʡ
     */
    private String province;

    private String city;

    private String region;

    private String detailAddress;

    /**
     * ʡ
     */
    private String areacode;

    private Boolean defaultStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
