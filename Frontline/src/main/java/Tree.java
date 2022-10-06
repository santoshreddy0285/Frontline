import java.util.*;
import java.util.regex.Pattern;

public class Tree {

    public void printTree(List<String> input){

        Map<Integer, Map<Integer,Set<Integer>>> map = new TreeMap<>();

        input.stream()
                .map(x -> x.split(Pattern.quote(".")))
                .forEach(arr -> {
                        if(!map.containsKey(Integer.parseInt(arr[0]))){
                            Map<Integer,Set<Integer>> sortedMap = new TreeMap<>();
                            updateChildMap(arr, sortedMap);
                            map.put(Integer.valueOf(arr[0]), sortedMap);
                        }else{
                            Map<Integer,Set<Integer>> sMap = map.get(Integer.parseInt(arr[0]));
                            if(sMap.containsKey(Integer.parseInt(arr[1]))){
                                sMap.get(Integer.parseInt(arr[1])).add(Integer.parseInt(arr[2]));
                            }else{
                                updateChildMap(arr, sMap);
                            }
                        }
        });

        map.forEach((key1, value1) -> {
            System.out.println(key1);
            value1.forEach((key, value) -> {
                System.out.println("--" + key);
                value.forEach(integer -> System.out.println("---" + integer));
            });
        });



       /*
       If below code is complete , it will be the most optimized way
       Map<Integer, Map<Integer,Set<Integer>>> map2 = input.stream().map(x -> x.split(Pattern.quote("."))).map(y -> {
            Map<Integer, Map<Integer,Set<Integer>>> map1 = new TreeMap<>();
            Integer.parseInt(y[0]);
            {
                Map<Integer,Set<Integer>> sortedMap = new TreeMap<>();
                Set<Integer> set = new TreeSet<>();
                set.add(Integer.parseInt(y[2]));
                sortedMap.put(Integer.parseInt(y[1]),set);
                map1.put(Integer.valueOf(y[0]), sortedMap);
            }
            return map1;
        }).peek(System.out::println).reduce((integerMapMap, integerMapMap2) ->
        // Need to rethink new merge logic , below concat fails
                Stream.concat(integerMapMap.entrySet().stream(), integerMapMap2.entrySet().stream()).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))).get();
        System.out.println(map2);
        */



    }

    private void updateChildMap(String[] arr, Map<Integer, Set<Integer>> sMap) {
        Set<Integer> set = new TreeSet<>();
        set.add(Integer.parseInt(arr[2]));
        sMap.put(Integer.parseInt(arr[1]), set);
    }


}
