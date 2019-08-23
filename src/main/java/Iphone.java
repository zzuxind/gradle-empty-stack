import java.util.Scanner;

public class Iphone extends Mobile {
	private String hintmessageString="<iphone> message:";
	@Override
	public void message(String message) {
		System.out.println("iphone message:");
		super.message(message);
	}
}
