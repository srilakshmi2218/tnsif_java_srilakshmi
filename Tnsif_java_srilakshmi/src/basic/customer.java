package basic;

public class customer {
	private String city;
	private String cname;
	private static int id;

	public static void main(String[]args) {
		customer c1=new customer();
		c1.setId(101);
		c1.cname="raja";
		c1.city="villupuram";
		System.out.println(c1);
		
		
		customer c2=new customer();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		customer.id = id;
	}
	
	

}

