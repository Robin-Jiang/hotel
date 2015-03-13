package test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// numbers(5, new Integer[] { 31, 121, 30, 45, 7 });
		findK(1000, 10000);
	}

	/**
	 * Сǿ��һ��ѧ���� ͬʱ��Ҳ��һ���ڿ͡� ���Խ����󲻾ã������ȵķ����Լ��ĸߵ���ѧ��Ŀ��Ȼ���ˣ�����������������ѧУ������վ�������ֵĹ����У�
	 * ����������ɼ���ص�������һ�������ļ� ������ļ��� n �������ɣ�������������������ļ�����ԿΪ�� n �����ж�����λ�� 1
	 * ���ٵ��������������Ƚ϶࣬Сǿ ϣ�����ܰ����õ���Կ�����ڳɼ�����֮ǰ���ɼ��Ĺ����� ���������� �����ɶ������ݹ��ɣ�ÿ�����ݵ�һ��Ϊһ����
	 * n(1<=n<=10^5)����ʾ�����������ڶ��� n ��������ʾ�ļ��е�ÿ����(1<=ÿ����<=10^9)�����ļ���β�� ���������
	 * ����ÿ���������һ�У����������������������������к� 1 ���ٵ���������ж�������������������С���Ǹ���
	 */
	private static void numbers(Integer count, Integer[] nums) {
		Integer result = 0;
		Integer temp = 0;
		for (Integer num : nums) {
			int c = 0;
			String res = Integer.toBinaryString(num);
			for (int i = 0; i < res.length(); i++) {
				if (res.charAt(i) == '1') {
					c++;
				}
			}
			if (temp > c || temp == 0) {
				temp = c;
				result = num;
			}
			if (temp == c && result > num) {
				temp = c;
				result = num;
			}
			System.out.println(num + ":" + Integer.toBinaryString(num));
		}
		System.out.println("" + result);

	}

	/**
	 * һ��СŮ��������������ָ��������1����n������Ĵָ����1��ʼ����Ȼ��ʳָΪ2����ָΪ3������ָΪ4��СָΪ5����������ת��������ָ����6��
	 * ��ָΪ7��ʳָΪ8����ĴָΪ9����˷�����������ͣ���Ǹ���ָ�ϣ��ñ��1��2��3��4��5���α�ʾ��Ĵָ��ʳָ����ָ������ָ��Сָ�� �����ʽ��
	 * ����������ݡ�ÿ������ռһ�У�ֻ����һ������n(1<=n<=1000000000)�� �����ʽ��
	 * ÿ������ռһ�У�ֻ����һ������1��5֮�����������ʾ���ͣ������ָ��
	 */
	private static void countNum(Integer count) {
		Integer[] arr = new Integer[] { 2, 3, 4, 5, 4, 3, 2, 1 };
		int i = count - 1;
		int result = 0;
		int temp = 0;
		if (count == 1) {
			result = count;
		} else {
			while (i > 0) {
				if (temp > 7) {
					temp = 0;
				}
				result = arr[temp];
				temp++;
				i--;
			}
		}

		System.out.println("��" + count + "�����ǣ�" + result);
	}

	/**
	 * ����һ��������x�����Ƕ��庯��w(x)��ʾx�ĸ�����λ֮�ͣ�����w(1)=1 w(11)=2 w(223)= 7��
	 * ���Ƕ���һ��˳�򣬶�������x��y, ���w(x)<w(y) ����w(x) == w(y)����x���ֵ����yС�����ַ����㣩������Ϊx��С�ڡ�y��
	 * ���� ������Ϊ100 ��С�ڡ� 2 ��Ϊw(100) = 1 w(2) = 2 ������Ϊ 370 ��С�ڡ� 55 ������Ϊ�ַ���w(370) =
	 * w(55) = 10 ���ǡ�370�� < ��55��
	 * ����������n��k,1<=k<=n�����ǰ�1-n֮��ȫ������������������ϵ�ɡ�С���������ź�˳������k�ڵڼ���λ�ã����⣬��k��λ�õ����Ǽ���
	 * �����ʽ �������ݣ�ÿ������һ�а�����������n��k��(1<=k<=n<=10^18)�� �����ʽ
	 * ÿ������һ�У����������ո�ָ�����������һ����k��λ�ã��ڶ����ǵ�k��������
	 */
	private static void findK(Integer k, Integer n) {
		Integer pos = 0;
		Integer[] arr = null;
		if (k > n) {
			System.out.println("����Ĳ�������Kֵ����С��Nֵ��");
		} else {
			arr = getArray(n);
			arr = sort(arr);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == k) {
					pos = i + 1;
				}
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		System.out.println("K��λ�������ǣ�" + arr[k - 1]);
		System.out.println("K��λ���ǣ�" + pos);
	}

	private static Integer[] sort(Integer[] arr) {
		int temp = 0;
		int m = 0;
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				m = wi(arr[i]);
				n = wi(arr[j]);
				if (m > n) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}else if (m == n) {
					if (ws(arr[i]).compareTo(ws(arr[j])) > 0) {
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}

		return arr;
	}

	private static Integer[] getArray(Integer n) {
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			lst.add(i);
		}
		return (Integer[]) lst.toArray(new Integer[lst.size()]);
	}

	private static Integer wi(Integer n) {
		Integer sum = 0;
		String s = n.toString();
		for (int i = 0; i < n.toString().length(); i++) {
			sum += Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		return sum;
	}

	private static String ws(Integer n) {
		return n.toString();
	}

}
