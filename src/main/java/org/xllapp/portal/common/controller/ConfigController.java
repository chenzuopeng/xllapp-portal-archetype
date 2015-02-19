package org.xllapp.portal.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.xllapp.mvc.controller.SimpleController;
import org.xllapp.mvc.dao.CRUDDao;

import org.xllapp.portal.common.dao.ConfigDao;
import org.xllapp.portal.common.entity.Config;

/**
 * 
 *
 * @author dylan.chen Dec 30, 2013
 * 
 */
@RequestMapping("config")
@Controller
public class ConfigController extends SimpleController<Config>{

	private ConfigDao configDao;

	@Override
	protected CRUDDao<Config> getDao() {
		return this.configDao;
	}

	@Autowired
	public void setConfigDao(ConfigDao configDao) {
		this.configDao = configDao;
	}
	
}
