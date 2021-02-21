package com.kaush.warehouseapp.service;

import java.util.List;
import java.util.Optional;

import com.kaush.warehouseapp.model.OrderMethod;

public interface IOrderMethodService {
	
	public Integer saveOrderMethod(OrderMethod orderMethod);
	public void updateOrderMethod(OrderMethod orderMethod);
	public Optional<OrderMethod> getOrderMethodById(Integer id);
	public List<OrderMethod> getAllOrderMethods();
	public void deleteOrderMethod(Integer id);
	public boolean isOrderMethodExit(Integer id);
	
	
}
