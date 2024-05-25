package lesson7.interfacestatic_clash;

public interface Sup2 {
	default void myMethod(int x , int y) {
		System.out.println(x+y);
	}
	static  int uMethod()
	{
		return 20;
	}
}
