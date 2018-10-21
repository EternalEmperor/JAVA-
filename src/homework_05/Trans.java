package homework_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Trans {

	protected String trans_mod; // 交通类型
	protected SimpleDateFormat sdf;
	protected int toAir_time;// 到机场时间
	protected int reAir_time;// 从机场回来时间
	protected int toSta_time;// 到车站时间
	protected int reSta_time;// 从车站回来时间
	protected int colTic_time;// 取票时间
	protected int Secu_time;// 安检时间
	protected int wait_time;// 候车时间
	protected float speed;// 车速
	protected float price;// 单价
	protected String src; //出发地
	protected String tar; //目的地
	protected int distance; //距离
	
	public abstract void calucate(String src,String tar,int distance);
	
	public void getResult(String src,String tar,int distance) {
		calucate(src,tar,distance);
	}

	public String getTrans_mod() {
		return trans_mod;
	}

	public void setTrans_mod(String trans_mod) {
		this.trans_mod = trans_mod;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public int getToAir_time() {
		return toAir_time;
	}

	public void setToAir_time(int toAir_time) {
		this.toAir_time = toAir_time;
	}

	public int getReAir_time() {
		return reAir_time;
	}

	public void setReAir_time(int reAir_time) {
		this.reAir_time = reAir_time;
	}

	public int getToSta_time() {
		return toSta_time;
	}

	public void setToSta_time(int toSta_time) {
		this.toSta_time = toSta_time;
	}

	public int getReSta_time() {
		return reSta_time;
	}

	public void setReSta_time(int reSta_time) {
		this.reSta_time = reSta_time;
	}

	public int getColTic_time() {
		return colTic_time;
	}

	public void setColTic_time(int colTic_time) {
		this.colTic_time = colTic_time;
	}

	public int getSecu_time() {
		return Secu_time;
	}

	public void setSecu_time(int secu_time) {
		Secu_time = secu_time;
	}

	public int getWait_time() {
		return wait_time;
	}

	public void setWait_time(int wait_time) {
		this.wait_time = wait_time;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	
}
