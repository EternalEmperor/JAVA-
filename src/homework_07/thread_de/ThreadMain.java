
package JavaDemo.thread_de;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by captain on 2017/7/27.
 */
public class ThreadMain {

    public static void main(String[] args) {
    	//第一个的演示示例
        List<String> list = new CopyOnWriteArrayList<String>();
//    	  List<String> list = new ArrayList<String>();
        for(int cnt=0;cnt<1000;cnt++){
            list.add("abc");
        }
        ThreadSafeDemo1 demo1 = new ThreadSafeDemo1(list);
        ThreadSafeDemo1 demo2 = new ThreadSafeDemo1(list);
        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo2);
        thread1.start();
        thread2.start();
        
        

        //第二个的演示示例
//        List<String> list = new ArrayList<>();
//        ThreadSafeDemo2 demo1 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo2 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo3 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo4 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo5 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo6 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo7 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo8 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo2 demo9 = new ThreadSafeDemo2(list);
//        ThreadSafeDemo3 demo10 = new ThreadSafeDemo3(list);
//        new Thread(demo1).start();
//        new Thread(demo2).start();
//        new Thread(demo3).start();
//        new Thread(demo4).start();
//        new Thread(demo5).start();
//        new Thread(demo6).start();
//        new Thread(demo7).start();
//        new Thread(demo8).start();
//        new Thread(demo9).start();
//        new Thread(demo10).start();
        
    	
    	
    	
//        List<String> x = new ArrayList<String>();
//        x.add("a");
//        s s1 = new s(x);
//        System.out.println(x.remove("a"));
    }

}

class s{
	List<String> a;
	public s(List<String> a) {
		this.a = a;
		this.a.remove("a");
	}
}
