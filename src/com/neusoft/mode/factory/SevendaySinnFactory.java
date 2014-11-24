package com.neusoft.mode.factory;

import com.neusoft.hotel.service.SevendaySinnService;
import com.neusoft.hotel.service.impl.SevendaySinnServiceImpl;

/**
 * 七天酒店工厂类
 * 
 * @author jianglb
 * 
 */
public class SevendaySinnFactory {

	private SevendaySinnService service;

	public SevendaySinnFactory() {
		service = new SevendaySinnServiceImpl();
	}

	public String MemberLogin(String nType, String sValues, String sPassword) {
		return service.MemberLogin(nType, sValues, sPassword);
	}
}
