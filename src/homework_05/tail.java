package homework_05;

public class tail extends Trans {

	@Override
	public void calucate(String src, String tar, int distance) {
		System.out.println(trans_mod + "从" + src + "到" + tar + "所需时间为：" + 
				(toSta_time+reSta_time+colTic_time+Secu_time+wait_time+distance/speed*60)/60 + "小时"
				);
		System.out.println("所需价钱为：" + price * distance);

	}

	public tail() {
		trans_mod = "高铁";
		toSta_time = 25; //到车站时间
		reSta_time = 25; //从车站回来时间
		colTic_time = 10; //取票时间
		Secu_time = 15; //安检时间
		wait_time = 30; //候车时间
		speed = 300; //每小时车速
		price = 0.45f; //每公里单价
	}
	
	

}
