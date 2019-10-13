package _03_smurf;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf("handy");
		handy.eat();
		System.out.println(handy.getName());
		Smurf papa = new Smurf("papa");
		Smurf smurfette = new Smurf("smurfette");
		System.out.println(papa.getName() + papa.getHatColor() + papa.isGirlOrBoy());
		System.out.println(smurfette.getName() + smurfette.getHatColor() +smurfette.isGirlOrBoy());
	}

}
