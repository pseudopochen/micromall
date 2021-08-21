package com.luban.micromall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class UmsMember extends Model<UmsMember> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long levelId;

    private String username;

    private String password;

    private String nickname;

    private String mobile;

    private String email;

    /**
     * ͷ
     */
    private String header;

    private Integer gender;

    private LocalDate birth;

    private String city;

    /**
     * ְҵ
     */
    private String job;

    private String sign;

    private Integer sourceType;

    private Integer integration;

    private Integer growth;

    private Integer status;

    /**
     * ע
     */
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
