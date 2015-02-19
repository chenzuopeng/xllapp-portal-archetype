package org.xllapp.portal.demo.dao;

import org.xllapp.mvc.dao.CRUDDao;
import org.xllapp.mybatis.MyBatisRepository;
import org.xllapp.portal.demo.entity.Demo;

@MyBatisRepository
public interface DemoDao extends CRUDDao<Demo> {
	
}