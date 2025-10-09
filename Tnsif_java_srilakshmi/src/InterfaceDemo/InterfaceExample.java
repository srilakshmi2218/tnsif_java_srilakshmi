package InterfaceDemo;



interface Shape{
	 
	 //declaration
	void draw();
}

public class InterfaceExample implements Shape{
	
	//implementation or explanation
	public void draw() {
		System.out.println("Drawing a circle in an interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceExample id = new InterfaceExample();
		id.draw();
		

		
	}

}
