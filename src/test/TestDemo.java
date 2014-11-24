package test;

import com.neusoft.mode.factory.JJinnFactory;
import com.neusoft.mode.proxy.HotelProxy;

public class TestDemo {

	public static void main(String[] args) {
		String out = "";
//		// 调用汉庭接口
//		HTSinnFactory htFactory = HotelProxy.getHTSinnFactory();
//		out = htFactory.CancelOrder("1", "2", "3", "4");
//		System.out.println("汉庭：" + out);
//
//		// 调用七天接口
//		SevendaySinnFactory sevendayFactory = HotelProxy
//				.getSevendaySinnFactory();
//		out = sevendayFactory.MemberLogin("1", "aa", "aa");
//		System.out.println("七天：" + out);

		// 调用锦江之星接口
		JJinnFactory jjinn = HotelProxy.getJJinnFactory();
		out = jjinn.GetUnitList("a", "a");
		System.out.println("锦江之星：" + out);
	}

	
}


