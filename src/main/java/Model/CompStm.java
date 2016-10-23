package Model;

import utils.MyIStack;

/**
 * Created by Wyking on 10/23/2016.
 */
public class CompStm implements IStm {
    IStm st1;
    IStm st2;

    CompStm(IStm s1, IStm s2){
        st1 = s1;
        st2 = s2;
    }

    public String toString(){
        return st1.toString() + ";" + st2.toString();
    }
    public PrgState execute(PrgState state){
        MyIStack<IStm> stack = state.getExStack();
        stack.push(st2);
        stack.push(st1);
        return state;
    }
}
