package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wyking on 10/23/2016.
 */
public class ExecutionDictionary<S,I> implements MyIDictionary<S,I> {

    Map<S,I> map;
    ExecutionDictionary(){
        map = new HashMap<S, I>();
    }

    public void clear(){
        map.clear();
    };
    public boolean	containsKey(S key){
        return map.containsKey(key);
    };
    public boolean	containsValue(I value){
        return map.containsKey(value);
    };
    public I get(S key){
        return map.get(key);
    };
    public boolean isEmpty(){
        return map.isEmpty();
    };
    public void put(S key, I value){
        map.put(key, value);
    };
}
