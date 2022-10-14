import java.util.*;

/*
 0,0 -> Google
 0,1 -> Alpha
 Sysnonym -1

 1,0 -> Alpha
 1,1  -> Nest
Sysnonym -2

0 -> Google, Alpha
Found Alpha
0 -> Google, Alpha, Nest
1 -> micro, link
2 -> amazon, aws

Set<String>  Google, Alpha, Nest

Process Customer:
for(Interger key : map.getKeySet()) {

    Set<String> value = map.get(key);
    custtomerKey = customers.getKey();
    if(value.contains(custtomerKey)) {
        result.put(custtomerKey, customer.getValue())
    }

}

*/

public class Solution {
    public static void main(String args[] ) throws Exception {
        Map<String, Integer> customers = new HashMap<>();
        customers.put("A",10);
        customers.put("B",20);
        customers.put("C",30);
        customers.put("D",30);
        customers.put("G",30);

        String[][] synonyms = new String[][] { {"A","B"},{"B","C"},{"D","E"},{"F","G"}};
        getCustomerApiCalls(customers, synonyms);
    }

    static HashMap<String, Integer> getCustomerApiCalls(Map<String, Integer> customers, String[][] synonyms) {
        HashMap<String, Integer> result = new HashMap<>();
        HashMap<String, Set<String>> synonymsMap = processSynonyms(synonyms);

        /*for(String key : customers.keySet()) {
            for(String subkey : synonymsMap.keySet()) {
                Set<String> synonymsSetFound = synonymsMap.get(subkey);
                if(synonymsSetFound.contains(key)) {
                    int oldcount = 0;
                    if(result.get(key) != null) {
                        oldcount = result.get(key);
                    }
                    result.put(key, result.getOrDefault(oldcount + customers.get(key), customers.get(key)));
                }
            }
        }
        System.out.println(result.toString());*/
        return result;
    }

    static HashMap<String, Set<String>> processSynonyms(String[][] synonyms) {

        HashMap<String, Set<String>> synonymMap = new HashMap<>();
        String key = "";

        for(int i=0; i<synonyms.length; i++) {
            boolean found = false;
            Set<String> synonymsSet = new HashSet<>();
            for(int j=0; j<synonyms[i].length; j++) {
                key = synonyms[i][j];   // nest
                synonymsSet.add(synonyms[i][j]); // alpha,nest
            }

            for(String keySet : synonymMap.keySet()) {
                Set<String> synonymsSetFound = synonymMap.get(keySet);  //go, al
                System.out.println("Old::"+synonymsSetFound.toString());
                System.out.println("New::"+synonymsSet.toString());

                for(String val : synonymsSet) {
                    if(synonymsSetFound.contains(val)) {
                        found = true;
                        break;
                    }
                }
                if(found) { //alpha,nest -> go, alpha
                    System.out.println("Found::"+synonymsSet.toString());
                    synonymsSetFound.addAll(synonymsSet);
                    synonymMap.put(key, synonymsSetFound);
                }
            }
            if(!found) {
                synonymMap.put(key, synonymsSet); // Alpha -> go,al
            }
        }


        System.out.println(synonymMap);
        return synonymMap;
    }


}
