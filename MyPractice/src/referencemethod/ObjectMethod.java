package referencemethod;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ObjectMethod {
	
	public static void main(String[] args) {
		
		ObjectMethod oo=new ObjectMethod();
		Consumer<String> con=oo::printMessage;
		con.accept("F");
		
		Supplier<String> con1=oo::getText;
		System.out.println(con1.get());
		
		
	}
	
	public String getText()
	{
		return "Binod";
	}
	
	 public void printMessage(String message) {
	        System.out.println(message);
	    }

}
