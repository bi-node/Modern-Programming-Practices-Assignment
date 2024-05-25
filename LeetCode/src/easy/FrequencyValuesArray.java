package easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyValuesArray {
    public static void main(String[] args) {
        FrequencyValuesArray test = new FrequencyValuesArray();
        int[] arr = {1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;
        Map<Integer, Integer> map = test.findingFrequency(arr);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\"       : " + entry.getValue());
        }

        // or
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("Key:" + entry.getKey() + " Values: " + entry.getValue());

        }

    }

    public Map<Integer, Integer> findingFrequency(int[] a) {
        Map<Integer, Integer> mapfrequency = new HashMap<Integer, Integer>();

        for (int element : a) {
            mapfrequency.put(element, mapfrequency.getOrDefault(element, 0) + 1);
        }

//		for(Map.Entry<Integer, Integer> entry: mapfrequency.entrySet())
//		{
//			System.out.println("\""+entry.getKey()+"\"       : "+entry.getValue());
//		}
        return mapfrequency;

    }

}
