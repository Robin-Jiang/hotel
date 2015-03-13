package test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// numbers(5, new Integer[] { 31, 121, 30, 45, 7 });
		findK(1000, 10000);
	}

	/**
	 * 小强是一名学生， 同时他也是一个黑客。 考试结束后不久，他惊讶的发现自己的高等数学科目居然挂了，于是他果断入侵了学校教务部网站。在入侵的过程中，
	 * 他发现了与成绩相关的内容是一个加密文件 ，这个文件由 n 个数构成，经过分析，这个加密文件的密钥为这 n 个数中二进制位数 1
	 * 最少的数。但由于数比较多，小强 希望你能帮他得到密钥，好在成绩公布之前将成绩改过来。 输入描述： 输入由多组数据构成，每组数据第一行为一个数
	 * n(1<=n<=10^5)，表示数的数量，第二行 n 个整数表示文件中的每个数(1<=每个数<=10^9)。以文件结尾。 输出描述：
	 * 对于每组数据输出一行，先输出数据组数，再输出二进制中含 1 最少的数，如果有多个数符合条件，输出最小的那个。
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
	 * 一个小女孩正在用左手手指数数，从1数到n。她从拇指算作1开始数起，然后，食指为2，中指为3，无名指为4，小指为5。接下来调转方向，无名指算作6，
	 * 中指为7，食指为8，大拇指为9，如此反复。问最后会停在那个手指上？用编号1、2、3、4、5依次表示大拇指、食指、中指、无名指、小指。 输入格式：
	 * 输入多组数据。每组数据占一行，只包含一个整数n(1<=n<=1000000000)。 输出格式：
	 * 每组数据占一行，只包含一个介于1和5之间的整数，表示最后停留的手指。
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

		System.out.println("第" + count + "个数是：" + result);
	}

	/**
	 * 给定一个正整数x，我们定义函数w(x)表示x的各个数位之和，例如w(1)=1 w(11)=2 w(223)= 7。
	 * 我们定义一种顺序，对正整数x和y, 如果w(x)<w(y) 或者w(x) == w(y)并且x的字典序比y小（按字符串算），则认为x“小于”y。
	 * 例如 我们认为100 “小于” 2 因为w(100) = 1 w(2) = 2 我们认为 370 ”小于” 55 这是因为字符串w(370) =
	 * w(55) = 10 但是”370” < “55”
	 * 给定正整数n和k,1<=k<=n，我们把1-n之间全部的正整数按上述关系由“小”到“大”排好顺序，请问k在第几个位置？另外，第k个位置的数是几？
	 * 输入格式 多组数据，每组数据一行包含两个整数n和k，(1<=k<=n<=10^18)。 输出格式
	 * 每组数据一行，包含两个空格分隔的整数，第一个是k的位置，第二个是第k个整数。
	 */
	private static void findK(Integer k, Integer n) {
		Integer pos = 0;
		Integer[] arr = null;
		if (k > n) {
			System.out.println("输入的参数有误！K值必须小于N值！");
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
		System.out.println("K的位置整数是：" + arr[k - 1]);
		System.out.println("K的位置是：" + pos);
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
