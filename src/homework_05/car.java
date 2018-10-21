package homework_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class car extends Trans {

	@Override
	public void calucate(String src,String tar,int distance) {
		System.out.println(trans_mod + "从" + src + "到" + tar + "所需时间为：" + 
				(toSta_time+reSta_time+colTic_time+Secu_time+wait_time+distance/speed*60)/60 + "小时"
				);
		System.out.println("所需价钱为：" + price * distance);

	}

	public car() {
		trans_mod = "汽车";
		toSta_time = 30; //到车站时间
		reSta_time = 30; //从车站回来时间
		colTic_time = 15; //取票时间
		Secu_time = 5; //安检时间
		wait_time = 25; //候车时间
		speed = 100; //每小时车速
		price = 0.32f; //每公里单价
		
	}

	
}
