package utils;

import java.util.Stack;

/**
 * Created by Wyking on 10/23/2016.
 */
public class ExecutionStack<T> implements MyIStack<T> {

    Stack<T> stack;

    public ExecutionStack(){
        stack = new Stack<T>();
    }

    public void push(T el){
        stack.push(el);
    };
    public T pop(){
        return stack.pop();
    };
    public boolean isEmpty(){
        return (stack.isEmpty());
    };
}
