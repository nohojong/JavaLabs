package com.nhj.inheritance;

public class MountainBike extends Bicycle {
    ///////////////////////////////////////
	// sub class의 자신의 컨스트럭터가 호출될때
	// 무조건 부모클래스의 디폴트컨스트럭터가 호출된다!!!
	///////////////////////////////////////
    // the MountainBike subclass adds one field
//    public int seatHeight;
	int a;
	int b;
	public MountainBike(int a,int b,int startCadence,int startSpeed, int startGear) {
		super( startCadence, startGear, startSpeed);
		this.a=a;
		this.b=b;
	}
    
    public MountainBike() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String... args) {
    	MountainBike mountainBike= new MountainBike(1,2,3,4,5);
    	
    	mountainBike.cadence=1;
    	mountainBike.applyBrake(0);
    }
//    public MountainBike() {}
//    // the MountainBike subclass has one constructor
//    public MountainBike(int startHeight,
//                        int startCadence,
//                        int startSpeed,
//                        int startGear) {
//        super(startCadence, startSpeed, startGear);
//        seatHeight = startHeight;
//    }   
//        
//    // the MountainBike subclass adds one method
//    public void setHeight(int newValue) {
//        seatHeight = newValue;
}
