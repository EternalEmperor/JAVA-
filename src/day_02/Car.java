package day_02;

public class Car {
	public String type; //汽车型号
	public int tank; //邮箱容量
	public int oilConsumption; //耗油量
	public int tank_remain; //剩余油量
	
	
	
	
	public Car(String type, int tank, int oilConsumption, int tank_remain) {
		super();
		this.type = type;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
		this.tank_remain = tank_remain;
	}



	public boolean gas(int num) {
	if(num < 0) {
		return false;
	}
		else if((tank_remain + num) > tank) {
			System.out.println("超过油箱容量，加油失败");
			return false;
		}else {
			System.out.println("加油成功");
			return true;
		}
		
	}
	
	public boolean run() {
		if(tank_remain < 0) {
			return false;
		}
		return true;
	}
	public int getTank_remain() {
		return tank_remain;
	}
	public void setTank_remain(int tank_remain) {
		this.tank_remain = tank_remain;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTank() {
		return tank;
	}
	public void setTank(int tank) {
		this.tank = tank;
	}
	public int getOilConsumption() {
		return oilConsumption;
	}
	public void setOilConsumption(int oilConsumption) {
		this.oilConsumption = oilConsumption;
	}
	
}
