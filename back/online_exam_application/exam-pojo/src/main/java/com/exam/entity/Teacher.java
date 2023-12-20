package com.exam.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 教师表(Teacher)实体类
 *
 * @author makejava
 * @since 2023-12-20 20:48:25
 */

@Data
public class Teacher implements Serializable {
    private static final long serialVersionUID = 877177431326518973L;
    /**
     * 工号
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否删除（0 - 未删除，1 - 删除）
     */
    private Integer isDelete;

}

