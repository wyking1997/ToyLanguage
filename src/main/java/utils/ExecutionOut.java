package utils;

import java.util.ArrayList;

/**
 * Created by Wyking on 10/23/2016.
 */
public class ExecutionOut<T> implements MyIOut<T> {

    ArrayList<T> arr;
    ExecutionOut(){
        arr = new ArrayList<T>();
    }

    public boolean add(T e){
        return arr.add(e);
    };
    public void clear(){
        arr.clear();
    };
    public T get(int index) throws IndexOutOfBoundsException{
        return arr.get(index);
    };
    public boolean isEmpty(){
        return arr.isEmpty();
    };
    public void remove(int index) throws IndexOutOfBoundsException{
        arr.remove(index);
    };
}
