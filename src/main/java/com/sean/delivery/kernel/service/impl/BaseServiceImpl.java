package com.sean.delivery.kernel.service.impl;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sean.delivery.kernel.service.IBaseService;

import tk.mybatis.mapper.common.Mapper;


public class BaseServiceImpl<T, I extends Mapper<T>> implements IBaseService<T> {
	protected final Log log = LogFactory.getLog(this.getClass());

	private I baseMapper;
	public I getBaseMapper() {
		return baseMapper;
	}
	public void setBaseMapper(I _baseMapper){
		baseMapper=_baseMapper;
	}
	public T getModel(T t) {
		return baseMapper.selectOne(t);
	}

}
