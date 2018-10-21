package homework_05;

public class plane implements Trans {

	private final String trans_mod = "飞机";
	@Override
	public void calucate(String src, String tar, int distance) {
		System.out.println(trans_mod + "从" + src + "到" + tar + "所需时间为：" + 
				(double)(toAir_time+reAir_time+colTic_time_plane+Secu_time_plane+wait_time_plane+distance/plane_speed*60)/60 + "小时"
				);
		System.out.println("所需价钱为：" + plane_price * distance);
	}

	public plane() {


	}
	
	

}
