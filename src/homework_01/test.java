package homework_01;

public class test {

	public static void main(String[] args) {
		String a = "helloworld";
		String b = "helloworld";
		String d = "hello" + "world";
		String c = new String("hello world");
		String f = new String("hello world");
		System.out.println("a : b  " + (a==b));
		System.out.println("a : c  " + (a==c));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println("a : d  " + (a==d));
		System.out.println("c : f  " + (c==f));
		System.out.println("c:" + c.hashCode()); //��������Ϊʲô��һ����
		System.out.println("f:" + f.hashCode());

	}

}
