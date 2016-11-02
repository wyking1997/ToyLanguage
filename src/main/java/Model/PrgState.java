package Model;

import utils.MyIDictionary;
import utils.MyIOut;
import utils.MyIStack;

/**
 * Created by Wyking on 10/23/2016.
 */
public class PrgState {

    static int ID = 0;

    MyIStack<IStm> exStack;
    MyIDictionary<String, Integer> exDict;
    MyIOut<Integer> exOut;
    int id;

    public PrgState(MyIStack<IStm> st, MyIDictionary<String, Integer> dt, MyIOut<Integer> out){
        exStack = st;
        exDict = dt;
        exOut = out;
        id = ID++;
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

    public String toString(){
        return "Stack: " + exStack.toString() + "\nSymbolTable: " + exDict.toString() + "\nOutput: " + exOut.toString();
    }
}
