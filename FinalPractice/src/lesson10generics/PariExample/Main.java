package lesson10generics.PariExample;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
//		Pair<String, Integer>[] pairs = new GenImpl[]{new GenImpl<>("Binod", 50), 
//				
//		new GenImpl<>("Sagar", 20)};
		
		Pair<String, Integer> pair1=new GenImpl<String, Integer>("Binod", 50);
		Pair<String, Integer> pair2=new GenImpl<String, Integer>("Sagar", 40);
		Pair<String, Integer> pair3=new GenImpl<String, Integer>("Binod", 50);
		
		System.out.println(pair1);
		//System.out.println(pair1.equals(pair3));
		System.out.println(pair2);
		System.out.println(pair2.getValue());
		
	System.out.println(Main.equal1(pair1, pair2));
	}
	
	public static <K,V> boolean equal1 (Pair<K, V> pair1, Pair<K, V> pair2)
	{
		 
	  return pair1.getValue().equals(pair2.getValue()) && pair1.getKey().equals(pair2.getKey());
		
		

	}

}
