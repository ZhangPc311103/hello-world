package cn.itcast.mavenweb.service.impl;

import java.util.List;

import cn.itcast.mavenweb.dao.IDepDao;
import cn.itcast.mavenweb.domain.Dep;
import cn.itcast.mavenweb.service.IDepService;

public class DepServiceImpl implements IDepService {

	private IDepDao depDao;

	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<Dep> getList() {
		return depDao.getList();
	}

}
