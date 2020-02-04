package ch11;

class Juice {
	String name;
	
	Juice(String name) {this.name = name + "Juice";}
	public String toString() {return name;}
}

class Juicer {
	static Juice MakeJuice(FruitBox2<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList()) 
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox2<Fruit> fruitBox = new FruitBox2<Fruit>();
		FruitBox2<Apple> appleBox = new FruitBox2<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.MakeJuice(fruitBox));
		System.out.println(Juicer.MakeJuice(appleBox));
	}
}

class FruitBox2<T extends Fruit> extends Box<T> {}
