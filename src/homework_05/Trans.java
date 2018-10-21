package homework_05;


public interface  Trans {

	 int toAir_time = 45;// 到机场时间
	 int reAir_time = 45;// 从机场回来时间
	 int toSta_time = 30;// 到车站时间
	 int reSta_time = 30;// 从车站回来时间
	 int colTic_time_plane = 25 ;// 飞机取票时间
	 int colTic_time_carOrtail = 15; //汽车或高铁的取票时间
	 int Secu_time_plane = 25;// 飞机安检时间
	 int wait_time_plane = 50;// 候机时间
	 int Secu_time_carOrtail = 10; //汽车或高铁安检时间
	 int wait_time_carOrtail = 35; //汽车或高铁的候车时间
	 int car_speed = 100;// 汽车车速
	 float car_price = 0.32f;// 汽车单价
	 int tail_speed = 300; //动车车速
	 float tail_price = 0.45f; //动车单价
	 int plane_speed = 800; //飞机速度
	 float plane_price = 0.75f; //飞机单价

	
	public abstract void calucate(String src,String tar,int distance);
	
	public default void getResult(String src,String tar,int distance) {
		calucate(src,tar,distance);
	}

}
