package homework_05;

public class plane extends Trans {

	@Override
	public void calucate(String src, String tar, int distance) {
		System.out.println(trans_mod + "从" + src + "到" + tar + "所需时间为：" + 
				(toAir_time+reAir_time+colTic_time+Secu_time+wait_time+distance/speed*60)/60 + "小时"
				);
		System.out.println("所需价钱为：" + price * distance);
	}

	public plane() {
		trans_mod = "飞机";
		toAir_time = 60; //到机场时间
		reAir_time = 60; //从机场回来时间
		colTic_time = 30; //取票时间
		Secu_time = 25; //安检时间
		wait_time = 50; //候机时间
		speed = 800; //每小时车速
		price = 0.75f; //每公里单价
	}
	
	

}
