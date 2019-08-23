import java.util.Scanner;

public class Iphone extends Mobile {
	@Override
	public void call(String message) {
		if(message.length()<10) {
			System.out.println("<Iphone>");
			super.call(message);
		}else {
			System.out.println("<iPhone>消息无法发送");
		}
		
	}
	
	
	
}
