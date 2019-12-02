package com.roncoo.education.course.common.req;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 课程推荐-查看
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class CourseRecommendViewREQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键", required = true)
	private Long id;

}
