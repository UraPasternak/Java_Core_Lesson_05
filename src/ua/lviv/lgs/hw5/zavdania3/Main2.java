package ua.lviv.lgs.hw5.zavdania3;

public class Main2 {

	public static void main(String[] args) {
		
		Object a = new Frog();
		Amphibia frog = (Amphibia) a;
		
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();

	}

}
