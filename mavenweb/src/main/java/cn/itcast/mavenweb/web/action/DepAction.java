package cn.itcast.mavenweb.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import cn.itcast.mavenweb.domain.Dep;
import cn.itcast.mavenweb.service.IDepService;

public class DepAction {
	
	private IDepService depService;

	public void setDepService(IDepService depService) {
		this.depService = depService;
	}
	
	public String list(){
		List<Dep> list = depService.getList();
		ServletActionContext.getRequest().setAttribute("list", list);
		return "list";
		
	}
}
