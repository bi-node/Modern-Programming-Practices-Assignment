package lamdas;
@FunctionalInterface
public interface TriFunction <T,U,V,R> {
	
R apply(T t, U u, V v);

//for specific
//public interface TriFunction{
//int apply(int x, int y, int z);
//}//
}

