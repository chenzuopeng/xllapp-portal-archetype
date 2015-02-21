package org.xllapp.portal.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.xllapp.mvc.controller.SimpleController;
import org.xllapp.mvc.dao.CRUDDao;
import org.xllapp.mvc.utils.ResponseUtils;
import org.xllapp.portal.demo.dao.DemoDao;
import org.xllapp.portal.demo.entity.Demo;
import org.xllapp.service.config.ConfigService;

@RequestMapping("demo")
@Controller
public class DemoController extends SimpleController<Demo> {
	
	@Autowired
	private ConfigService configService;

	private DemoDao demoDao;

	@Override
	protected CRUDDao<Demo> getDao() {
		return this.demoDao;
	}

	@Autowired
	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	@RequestMapping("test")
	public View test(HttpServletRequest request, HttpServletResponse response,Model model) {
		model.addAttribute("aaa", "123");
		return ResponseUtils.getJsonView(true, "123");
	}
	
	@RequestMapping("testConfig")
	public void testConfig(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception {
		System.err.println(this.configService.getGroup("a"));
	}

}
