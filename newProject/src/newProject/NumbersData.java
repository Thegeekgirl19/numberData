package newProject;

public class NumbersData {
	private int data[] = {0,42,12};
	
	public void display() {
		System.out.println();
		System.out.println("Data: ");
		for(int d: data) {
			System.out.println(d);
		}
	}
}
