package _01_getters_and_setters;

public class Runner {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		person1.setSuperpower("flying");
		person1.setName("Steve");
		person2.setSuperpower("super strength");
		person2.setName("Arnold");
		person3.setSuperpower("teleportation");
		person3.setName("Caleb");
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
	}

}
