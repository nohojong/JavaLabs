package com.nhj.inheritance;

public class BicycleMain {

	public static void main(String[] args) {
		
		SuperClass sc1= new SuperClass();
	

		Object obj = new MountainBike();
		
		// 하지만 다음과같은 statement 는 성립하지 않는다
		// MountainBike mb = obj;
		
		SuperClass sc = new SuperClass();
		//obj = sc;
		
		//정말 나쁜 코드..., 하지만, 안전장치를 장착[obj instanceof MountainBike] 하면,,,
		if (obj instanceof MountainBike) {// obj가 MountainBike 인스턴스 인지 아닌지 판별해줌.
			MountainBike mb = (MountainBike)obj;
		} else {
			System.out.println(sc);
		}
	}

}
