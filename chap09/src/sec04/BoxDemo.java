package sec04;

import java.util.ArrayList;

import sec03.Apple;

public class BoxDemo {
	public static void main(String[] args) {
		BoxFactory bf = new BoxFactory();
		Box<String> sBox = bf.makeBox("Sweet");
		System.out.println(sBox.getOb());

		Box<Double> dBox = bf.makeBox(7.59);
		System.out.println(dBox.getOb());

		Box<Apple> aBox = bf.makeBox(new Apple());
		System.out.println(aBox.getOb());

		ArrayList<String> al = new ArrayList<>();
		al.add("Sweet");
		al.add("Potatos");

		Box<ArrayList<String>> boxLists = bf.makeBox(al);
		System.out.println(boxLists.getOb());

		String[] str = { "Delicious", "strawberrys" };
		Box<String[]> strLists = bf.makeBox(str);
		for (String s : strLists.getOb())
			System.out.println(s);

	}
}
