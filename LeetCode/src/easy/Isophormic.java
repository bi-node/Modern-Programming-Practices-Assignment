package easy;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Isophormic {

	public static void main(String[] args) {
		Isophormic test = new Isophormic();
		System.out.println(test.isIsomorphic("xxya", "yyzz"));
	}

public boolean isIsomorphic(String s, String t) {
	if(s.length()!=t.length()) return false;
	Map<Character, Character> mapc=new HashMap<Character, Character>();
	for(int i=0; i<s.length(); i++)
	{
		System.out.println(mapc.get(s.charAt(i)));
		if(mapc.containsKey(s.charAt(i)))
		{
			if(t.charAt(i)!=mapc.get(s.charAt(i)))
					{
				return false;
					}
		}
		if(mapc.containsValue(t.charAt(i)))
		{
			for(Map.Entry<Character, Character> entry: mapc.entrySet())
			{
				if(entry.getValue()==t.charAt(i))
				{
					if(entry.getKey()!=s.charAt(i)) return false;
				}
			}
			
		}
	
		mapc.put(s.charAt(i), t.charAt(i));
		
		
	}
	return true;
        
    }



}
