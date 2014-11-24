package com.neusoft.mode.proxy;

import com.neusoft.mode.factory.HTSinnFactory;
import com.neusoft.mode.factory.JJinnFactory;
import com.neusoft.mode.factory.SevendaySinnFactory;

/**
 * 酒店代理接口
 * 
 * @author jianglb
 * 
 */
public class HotelProxy {

	public static HTSinnFactory getHTSinnFactory() {
		return new HTSinnFactory();
	}

	public static SevendaySinnFactory getSevendaySinnFactory() {
		return new SevendaySinnFactory();
	}

	public static JJinnFactory getJJinnFactory() {
		return new JJinnFactory();
	}
}
