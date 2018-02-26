package personal.part1;

public class MakingPersonal {
	private Object personalThing;
	private int input1;
	private int input2;
	private int inputFin;
	
	public MakingPersonal (Object personalThing, int input1, int input2) {
		this.personalThing = personalThing;
		this.input1 = input1;
		this.input2 = input2;
		this.inputFin = input1 + input2;
	}
	
	private void setPersonalThing () {
		this.personalThing = personalThing;
	}
	
	public Object getPersonalThing () {
		return personalThing;
	}
	
	public Object addPersonalThing () {
		return inputFin;
	}
	
	public Object getAndAddPersonalThing () {
		if (input1 == 2 || input2 == 2) {
			return (personalThing + ": the input will be 4");
		} else if (input1 == 3 || input2 == 3) {
			return (personalThing + ": the input gon be 9");
		} else {
			return (personalThing + " + this sum: " + inputFin);
		}
	}
	
	private void personalMethod () {
		
		
		System.out.println("It's the rapture");
		
	}
}
