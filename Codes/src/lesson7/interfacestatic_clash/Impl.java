package lesson7.interfacestatic_clash;

public class Impl implements Sup1 , Sup2 {
	
	public static void main(String[] args) {
		Impl s = new Impl();
		Impl s1=new Impl();
		s.myMethod(10);
		s1.myMethod(5, 10);
		
		
	}

	
	
	
	
}
