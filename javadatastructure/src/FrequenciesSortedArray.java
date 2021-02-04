import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

public class FrequenciesSortedArray {
    public static HashMap<Integer, Integer> Get(int[] arr, int length) {
        // using linear search
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 1;
        for(int i = 0; i < length; i++) {
                if(i!= 0 && arr[i] == arr[i-1] ) {
                    map.put(arr[i], (map.get(arr[i]) + 1));
                    count++;
                }
                else {
                    map.put(arr[i], 1);
                }
        }
        return map;
    }
}
