package cn.itcast.mavenweb.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.mavenweb.dao.IDepDao;
import cn.itcast.mavenweb.domain.Dep;

public class DepDaoImpl extends HibernateDaoSupport implements IDepDao {

	@Override
	public List<Dep> getList() {
		return (List<Dep>) this.getHibernateTemplate().find("from Dep");
	}

}
