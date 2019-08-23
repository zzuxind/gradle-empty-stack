
public class Andriod extends Mobile{
	private String hintmessageString="<android> message:";
	
	@Override
	public void message(String message) {
		System.out.println("android message:");
		super.message(message);
	}
}
