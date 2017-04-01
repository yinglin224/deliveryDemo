package com.sean.delivery.kernel.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @description 所有Controller都必须继承与本Controller，此类中的方法主要是Controller公用方法
 */
public abstract class BaseController extends MultiActionController {
	

    protected final Log logger = LogFactory.getLog(this.getClass());

}
