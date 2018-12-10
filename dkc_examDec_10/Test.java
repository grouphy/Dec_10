package dkc_examDec_10;
class A{
	public A() {
		System.out.println("----");
		printf();
	}

	public void printf() {
		// TODO Auto-generated method stub
		System.out.println("you are my 桑");
	}
}
class B extends A{
	public B() {
		printf();
		System.out.println("------");
	}
	public void printf(){
		System.out.println("oh my God");
	}
}
public class Test {
	public static void main(String[] args) {
		new B();
	}
}
