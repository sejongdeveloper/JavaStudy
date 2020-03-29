package ch07_test;


class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}

public class quiz15 {
	public static void main(String[] args) {
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		GroundUnit gu = (GroundUnit)u;
//		t = (Tank)u;
	}
}
