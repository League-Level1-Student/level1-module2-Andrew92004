package _02_sea_creature;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature bob = new SeaCreature("Spongebob");
		bob.eat();
		bob.laugh();
		SeaCreature pat = new SeaCreature("Patrick");
		System.out.println(pat.getName());
		pat.eat();
		pat.laugh();
		SeaCreature squid = new SeaCreature("Squidward");
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
	}

}
