package com.bkhb.bkadmin.app.system.pojo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

/**
 * 用户实体类
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/5/29 15:42
 */
@Data
@Entity
@DynamicUpdate
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username", unique = true)
    private String userName;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickName;

    /**
     * 密码
     */
    @Column(name = "password")
    private String passWord;

    /**
     * 邮箱
     */
    @Column(name = "email", length = 50)
    private String email;

    /**
     * 手机号
     */
    @Column(name = "phone", length = 11)
    private String phone;

    /**
     * 性别 0男 1女 2保密
     */
    @Column(name = "sex", length = 1)
    private Integer sex;

    /**
     * 头像地址
     */
    @Column(name = "avatar")
    private String avatar;

    /**
     * 状态 0正常 1停用
     */
    @Column(name = "status", length = 1)
    private Integer status;

    /**
     * 最后登录ip
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    private LocalDateTime loginTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    public User() {
    }
}
