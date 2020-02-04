package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4 {
	String name;
	int weight;
	
	public Fruit4(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name+"("+weight+")";
	}
}

class Apple4 extends Fruit4	{
	public Apple4(String name, int weight) {
		super(name, weight);
	}
}

class Grape4 extends Fruit4	{
	public Grape4(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple4> {
	@Override
	public int compare(Apple4 t1, Apple4 t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape4> {
	@Override
	public int compare(Grape4 t1, Grape4 t2) {
		return t2.weight - t1.weight;
	}
}

class FruiteComp implements Comparator<Fruit4> {
	@Override
	public int compare(Fruit4 t1, Fruit4 t2) {
		return t1.weight - t2.weight;
	}
}

public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox4<Apple4> appleBox = new FruitBox4<Apple4>();
		FruitBox4<Grape4> grapeBox = new FruitBox4<Grape4>();
		
		appleBox.add(new Apple4("GreenApple", 300));
		appleBox.add(new Apple4("GreenApple", 100));
		appleBox.add(new Apple4("GreenApple", 200));
		
		grapeBox.add(new Grape4("GreenGrape", 400));
		grapeBox.add(new Grape4("GreenGrape", 300));
		grapeBox.add(new Grape4("GreenGrape", 200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruiteComp());
		Collections.sort(grapeBox.getList(), new FruiteComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	} // main
}

class FruitBox4<T extends Fruit4> extends Box4<T> {}

class Box4<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() {
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
}
