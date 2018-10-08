package homework_02;

public class Car {
	public String type; //�����ͺ�
	public int tank; //��������
	public int oilConsumption; //������
	public int tank_remain; //ʣ������
	
	
	
	
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
			System.out.println("������������������ʧ��");
			return false;
		}else {
			System.out.println("���ͳɹ�");
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
