package Model;

import utils.MyIDictionary;
import utils.MyIOut;
import utils.MyIStack;

/**
 * Created by Wyking on 10/23/2016.
 */
public class PrgState {
    MyIStack<IStm> exStack;
    MyIDictionary<String, Integer> exDict;
    MyIOut<Integer> exOut;

    PrgState(MyIStack<IStm> st, MyIDictionary<String, Integer> dt, MyIOut<Integer> out){
        exStack = st;
        exDict = dt;
        exOut = out;
    }

    public MyIStack<IStm> getExStack() {
        return exStack;
    }

    public MyIDictionary<String, Integer> getExDict() {
        return exDict;
    }

    public MyIOut<Integer> getExOut() {
        return exOut;
    }
}
