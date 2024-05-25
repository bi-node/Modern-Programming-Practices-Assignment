package enumexample;

public enum Singleton {
	INSTANCE;
	private Singleton() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor enum");
	}
	
	
	public static void main(String[] args) {
		Singleton s=Singleton.INSTANCE;
		Singleton s1=Singleton.INSTANCE;
		System.out.println(s);
		System.out.println(s1);
	}

}
