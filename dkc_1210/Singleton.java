package cn.dkc_1210;
class Singleton{
	/*
	饿汉式
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getSingleton() {
		return singleton;
	}*/
	//懒汉式
	private static Singleton singleton = null;
	private Singleton() {}
	public static Singleton getSingleton() {
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1);
		System.out.println(s2);
	}
}
