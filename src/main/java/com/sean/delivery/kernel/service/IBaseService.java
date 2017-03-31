package com.sean.delivery.kernel.service;


public interface IBaseService<T> {
	
	/**
     * @Description:根据实体属性查询实体对象
     * @param:实体对象
     * @return 实体对象
     */
	public  T getModel(T t);
	

}
