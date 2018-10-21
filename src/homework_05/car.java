package homework_05;



public class car implements Trans {

	private final String trans_mod = "汽车";
	
	@Override
	public void calucate(String src,String tar,int distance) {
		System.out.println(trans_mod + "从" + src + "到" + tar + "所需时间为：" + 
				(double)(toSta_time+reSta_time+colTic_time_carOrtail+Secu_time_carOrtail+wait_time_carOrtail+distance/car_speed*60)/60 + "小时"
				);
		System.out.println("所需价钱为：" + car_price * distance);

	}

	public car() {
		
	}

	
}
