package com.juzi.oerp.model.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Juzi
 * @date 2020/7/27 11:11
 */
@Data
public class ApplyInfoVO {

    /**
     * 报名id
     */
    private Integer applyId;

    /**
     * 考试名称
     */
    private String title;

    /**
     * 考试时间
     */
    private LocalDateTime examTime;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 身份证号码
     */
    private String identityNo;

    /**
     * 学校
     */
    private String school;

    /**
     * 学历
     */
    private String education;

    /**
     * 报名时间
     */
    private LocalDateTime createTime;

    /**
     * 报名状态
     */
    private Integer status;

}
