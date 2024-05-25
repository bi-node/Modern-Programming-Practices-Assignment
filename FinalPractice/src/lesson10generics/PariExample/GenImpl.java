package lesson10generics.PariExample;

public class GenImpl<K,V> implements Pair<K, V> {
	K key;
	V value;
	

	GenImpl(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return  key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append("\nThe Key is: "+key);
		sBuilder.append("\nThe Value is: "+value);
		return sBuilder.toString();
	}

//	@Override
//	public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        GenImpl<?, ?> genImpl = (GenImpl<?, ?>) o;
//
//        if (key != null ? !key.equals(genImpl.key) : genImpl.key != null) return false;
//        return value != null ? value.equals(genImpl.value) : genImpl.value == null;
//    }
	

}
