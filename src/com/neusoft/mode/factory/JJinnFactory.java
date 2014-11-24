package com.neusoft.mode.factory;

import com.neusoft.hotel.service.JJinnService;
import com.neusoft.hotel.service.impl.JJinnServiceImpl;

public class JJinnFactory {

	private JJinnService service;

	public JJinnFactory(){
		this.service = new JJinnServiceImpl();
	}

	public String GetUnitList(String ContractCode, String ContractKey) {
		return this.service.GetUnitList(ContractCode, ContractKey);
	}
}
