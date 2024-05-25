package lesson9.constructorref.bifuntion;

public interface QuadFunction<S, R, U, T, E> {

	E apply(S s, R r, U u, T t);

}
