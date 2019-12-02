package com.roncoo.education.course.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.course.service.api.biz.ApiCourseRecommendBiz;
import com.roncoo.education.course.common.bo.CourseRecommendBO;
import com.roncoo.education.course.common.dto.CourseRecommendListDTO;
import com.roncoo.education.util.base.Result;

import io.swagger.annotations.ApiOperation;

/**
 *
 * 课程推荐
 *
 * @author kyh
 *
 */
@RestController
@RequestMapping(value = "/course/api/course/recommend")
public class ApiCourseRecommendController {

	@Autowired
	private ApiCourseRecommendBiz biz;

	/**
	 * 课程推荐列出接口
	 *
	 * @author kyh
	 */
	@ApiOperation(value = "课程推荐列出接口", notes = "课程推荐列出接口")
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public Result<CourseRecommendListDTO> list(CourseRecommendBO courseRecommendBO) {
		return biz.list(courseRecommendBO);
	}

}
