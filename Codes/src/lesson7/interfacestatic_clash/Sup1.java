package lesson7.interfacestatic_clash;

public interface Sup1 {
	default void myMethod(int x) {
		System.out.println(x);
	}
	static int  uMethod() {
		return 10;
	}
	
}
