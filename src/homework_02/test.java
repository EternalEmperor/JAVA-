package homework_02;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ArrayList<Car> car_Arr = new ArrayList<Car>();
		Scanner in = new Scanner(System.in);
		String type = in.nextLine();
		int tank = in.nextInt();
		int tank_remain = in.nextInt();
		int oilConsumption = in.nextInt();
		Car car1 = new Car(type,tank,oilConsumption,tank_remain);
		car_Arr.add(car1);
		for(Car c : car_Arr) {
			System.out.println(
					"�������ͣ�"+c.getType()+
					"����������"+c.getTank()+
					"��������" +c.getOilConsumption()+
					"ʣ��������"+c.getTank_remain()
					);
		}
	}
}
