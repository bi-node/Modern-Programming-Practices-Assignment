package classexercises;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class MilestoKm {
	
	public static void main(String[] args) {
		DoubleFunction<Double> exp1=(x->x*1.6);
		double ans=exp1.apply(50);
				System.out.println("Given miles to km"+ans);
				
			IntConsumer exp2=(y->{
			if(y%2==1) 
				System.out.println("Odd");
			else System.out.println("even");
			});
			
			exp2.accept(9);
		
	}

}
