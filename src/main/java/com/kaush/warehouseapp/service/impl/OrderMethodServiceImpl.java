package com.kaush.warehouseapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaush.warehouseapp.model.OrderMethod;
import com.kaush.warehouseapp.repo.OrderMethodRepo;
import com.kaush.warehouseapp.service.IOrderMethodService;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {

	@Autowired
	private OrderMethodRepo orderMethodRepo;
	
	@Override
	public Integer saveOrderMethod(OrderMethod orderMethod) {
		OrderMethod savedOrderMethod = orderMethodRepo.save(orderMethod);
		return savedOrderMethod.getId();
	}

	@Override
	public void updateOrderMethod(OrderMethod orderMethod) {
		orderMethodRepo.save(orderMethod);
	}
	
	@Override
	public Optional<OrderMethod> getOrderMethodById(Integer id) {
		return orderMethodRepo.findById(id);
	}

	@Override
	public List<OrderMethod> getAllOrderMethods() {
		return orderMethodRepo.findAll();
	}

	@Override
	public void deleteOrderMethod(Integer id) {
		orderMethodRepo.deleteById(id);
	}

	@Override
	public boolean isOrderMethodExit(Integer id) {
		return orderMethodRepo.existsById(id);
	}
	
	

}
