import java.util.Scanner;

public class Mobile {
	private String nameString;
	private String colorString;
	private String branString;
	
	public Mobile(String nameString, String colorString, String branString) {
		this.nameString = nameString;
		this.colorString = colorString;
		this.branString = branString;
	}
	
	public Mobile(){
		
	}
	
	public void message(String message) {
		System.out.println("message:"+message);
//		Scanner scanner=new Scanner(System.in);
//		System.out.println(scanner.nextLine());
	}
	
}
