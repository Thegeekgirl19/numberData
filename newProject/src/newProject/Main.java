package newProject;

public class Main {
	public static void main(String args[]) {
		NumbersData nd = new NumbersData();
		
		displayGreet();
		nd.display();
	}
	
	private static void displayGreet() {
		System.out.println("Hello");
		System.out.println("Thank you");	
	}
}
