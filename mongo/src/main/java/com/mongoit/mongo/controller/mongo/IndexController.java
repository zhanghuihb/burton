package com.mongoit.mongo.controller.mongo;

import com.mongoit.common.base.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tainy
 * @date 2020/11/10 0010 19:41
 */
@RestController
@RequestMapping("/index")
@Api(tags = "首页API")
public class IndexController extends BaseController {


}
