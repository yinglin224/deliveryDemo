package com.sean.delivery.kernel.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sean.delivery.kernel.dao.DepartmentMapper;
import com.sean.delivery.kernel.entity.Department;
import com.sean.delivery.kernel.service.IDepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department, DepartmentMapper> implements IDepartmentService {

	@Resource
	private DepartmentMapper departmentmapper;
	
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(departmentmapper);
	} 
	

}
