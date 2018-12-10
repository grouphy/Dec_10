package dkc_examDec_10;
class Base{
	private String name = "DZ";
	public Base() {
		System.out.println("Base name is "+name);
		tellName();
		printName();
		System.out.println("-----");
	}

	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Base print name is "+name);
	}

	public void tellName() {
		// TODO Auto-generated method stub
		System.out.println("Base tell name is "+name);
	}
}
public class Drived extends Base{
	private String name = "ZY";
	public Drived() {
		// TODO Auto-generated constructor stub
		System.out.println("Drived name is "+name);
		tellName();
		printName();
	}
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Drived print name is "+name);
	}

	public void tellName() {
		// TODO Auto-generated method stub
		System.out.println("Drived tell name is "+name);
	}
	
	public static void main(String[] args) {
		new Drived();
	}
}
