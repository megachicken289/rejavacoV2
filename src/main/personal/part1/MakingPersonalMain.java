package personal.part1;

import java.util.Scanner;

public class MakingPersonalMain {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String person = null;
		int in1 = 0;
		int in2 = 0;
		
		MakingPersonal person1 = new MakingPersonal("Frank", 2, 2);
		MakingPersonal person2 = new MakingPersonal("Melissa", 3, 3);
		
		MakingPersonal[] personals = new MakingPersonal[2];
		
		do {
			System.out.println(person1);
			System.out.println(person2);
			System.out.println(person1.getPersonalThing());
			System.out.println(person2.getPersonalThing());
			System.out.println(person1.addPersonalThing());
			System.out.println(person2.addPersonalThing());
			
			System.out.println(person1.getAndAddPersonalThing());
			System.out.println(person2.getAndAddPersonalThing());
			
			System.out.println("First will ask for name(STRING), then INT, finally INT");
			person = scan.nextLine();
			System.out.println("in1");
			in1 = scan.nextInt();
			System.out.println("in2");
			in2 = scan.nextInt();
		} while (person == null);
		MakingPersonal personCus = new MakingPersonal(person, in1, in2);
		
		System.out.println(personCus);
		System.out.println(personCus.getPersonalThing());
		System.out.println(personCus.addPersonalThing());
		
		System.out.println(personCus.getAndAddPersonalThing());
		
	}
}
