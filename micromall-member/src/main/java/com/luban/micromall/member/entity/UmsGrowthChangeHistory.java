package com.luban.micromall.member.entity;

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
public class UmsGrowthChangeHistory extends Model<UmsGrowthChangeHistory> {

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

    /**
     * create_time
     */
    private LocalDateTime createTime;

    private Integer changeCount;

    private String note;

    private Integer sourceType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
