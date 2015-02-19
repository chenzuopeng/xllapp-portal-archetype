package org.xllapp.portal.common.dao;

import org.xllapp.mvc.dao.CRUDDao;
import org.xllapp.mybatis.MyBatisRepository;

import org.xllapp.portal.common.entity.Config;

/**
 * 
 *
 * @author dylan.chen Dec 30, 2013
 * 
 */
@MyBatisRepository
public interface ConfigDao extends CRUDDao<Config> {
	
	public Config getConfig(String group,String key);
	
}