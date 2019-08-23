
public class Andriod extends Mobile{
	@Override
	public void call(String message) {
		if (message.length()<15) {
			System.out.println("<Android>");
			super.call(message);
			
		} else {
			System.out.println("<Android>消息无法发送");
		}
	}
}
