package test;

import com.neusoft.mode.factory.JJinnFactory;
import com.neusoft.mode.proxy.HotelProxy;

public class TestDemo {

	public static void main(String[] args) {
		String out = "";
//		// ���ú�ͥ�ӿ�
//		HTSinnFactory htFactory = HotelProxy.getHTSinnFactory();
//		out = htFactory.CancelOrder("1", "2", "3", "4");
//		System.out.println("��ͥ��" + out);
//
//		// ��������ӿ�
//		SevendaySinnFactory sevendayFactory = HotelProxy
//				.getSevendaySinnFactory();
//		out = sevendayFactory.MemberLogin("1", "aa", "aa");
//		System.out.println("���죺" + out);

		// ���ý���֮�ǽӿ�
		JJinnFactory jjinn = HotelProxy.getJJinnFactory();
		out = jjinn.GetUnitList("a", "a");
		System.out.println("����֮�ǣ�" + out);
	}

	
}


