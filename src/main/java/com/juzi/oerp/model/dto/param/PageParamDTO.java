package com.juzi.oerp.model.dto.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分页参数
 *
 * @author Juzi
 * @date 2020/7/15 12:25
 */
@Data
@ApiModel(value = "分页参数")
public class PageParamDTO {

    @ApiModelProperty("当前页码-从 1 开始")
    private Integer pageOn = 1;

    @ApiModelProperty("每页条数")
    private Integer pageSize = 10;

    @ApiModelProperty("搜索关键字")
    private String keyword = "";
}
