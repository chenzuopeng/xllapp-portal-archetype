package org.xllapp.portal.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xllapp.mvc.controller.CRUDController;
import org.xllapp.mvc.dao.CRUDDao;
import org.xllapp.portal.demo.dao.DemoDao;
import org.xllapp.portal.demo.entity.Demo;

/**
 * 
 * 
 * @author dylan.chen Mar 13, 2014
 * 
 */
@RequestMapping("/demo/crud")
@Controller
public class DemoCRUDController extends CRUDController<Demo> {

	private DemoDao demoDao;

	@Override
	protected CRUDDao<Demo> getDao() {
		return this.demoDao;
	}

	@Autowired
	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	@Override
	protected Object getSaveView(boolean success, Throwable throwable, Demo entity, ModelAndView model) {
		return "redirect:demo";
	}

	@Override
	protected Object getDeleteView(boolean success, Throwable throwable, Long[] ids, ModelAndView model) {
		return "redirect:demo";
	}

	@Override
	protected Object getFormView(boolean success, Throwable throwable, Demo entity, ModelAndView model) {
		return "demo/form";
	}

	@Override
	protected Object getQueryView(boolean success, Throwable throwable, Map<String, Object> params, ModelAndView model) {
		System.err.println("ccc");
		return "demo/list";
	}

}
