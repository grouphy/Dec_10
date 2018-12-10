package dkc_examDec_10;
class Father{
	String name;
	public Father() {
		System.out.println("1");
	}
	public Father(String name) {
		System.out.println("2");
		this.name = name;
	}
}
public class Child extends Father{
	Father f;
	public Child() {
		System.out.println("4");
	}
	public Child(String name) {
		super(name);
		System.out.println("3");
		this.name = name;
		f = new Father(name+"F");		
	}
	public static void main(String[] args) {
		 new Child("DZ");
	}
}
