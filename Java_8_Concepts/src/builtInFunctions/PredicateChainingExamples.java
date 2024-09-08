package builtInFunctions;

import java.util.function.Predicate;

public class PredicateChainingExamples {
	
	Predicate<String> campusInterview;
	Predicate<String> degreeStatus;
	Predicate<Boolean> opposite;
	
	public void andExample() {
		
		campusInterview = interviewInput -> interviewInput.equalsIgnoreCase("yes");
		degreeStatus = degreeInput -> degreeInput.equalsIgnoreCase("yes");
		System.out.println("AND Example can I join the company ? " + campusInterview.and(degreeStatus).test("Yes"));
		
	}
	
	public void orExample() {
		
		campusInterview = interviewInput -> interviewInput.equalsIgnoreCase("yes");
		degreeStatus = degreeInput -> degreeInput.equalsIgnoreCase("no");
		System.out.println("OR Example can I join the company ? " + campusInterview.or(degreeStatus).test("Yes"));
		
	}
	
	public void negateExample() {
		opposite = input -> input;
		System.out.println("Negate Example : " + opposite.test(false));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredicateChainingExamples obj = new PredicateChainingExamples();
		obj.andExample();
		obj.orExample();
		obj.negateExample();
		

	}

}
