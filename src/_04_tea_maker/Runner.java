package _04_tea_maker;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag green = new TeaBag("Green");
		green.getFlavor();
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(green, kettle.getWater());
	}

}
