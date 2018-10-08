package homework_03;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(1);
		Integer integer=new Integer(10);
		list.add(integer);
		Integer integer1=list.get(0);
		int a = integer1;
		System.out.println(a);
		//����ʹinteger1=3;��list�����Ԫ���Ƿ�ı䣿
		integer1 = 3;
		Integer integer2=list.get(0);
		int b = integer2;
		System.out.println(b);
	}
}
