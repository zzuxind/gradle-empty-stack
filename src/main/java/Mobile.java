

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
	
	public void call(String message) {
		System.out.println("message:"+message);
	}
	
	public void info() {
		System.out.println("名称:"+nameString+",颜色:"+colorString+",品牌:"+branString);
	}
	
}
