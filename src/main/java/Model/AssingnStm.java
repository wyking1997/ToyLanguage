package Model;

import utils.MyIDictionary;

/**
 * Created by Wyking on 10/29/2016.
 */
public class AssingnStm implements IStm {

    String nm;
    Exp exp;

    public AssingnStm(String var_name, Exp expression){
        nm = var_name;
        exp = expression;
    }

    public PrgState execute(PrgState state) throws Exception {
        MyIDictionary<String, Integer> stable = state.getExDict();
        stable.put(nm, exp.eval(stable));
        return state;
    }

    public String toString(){
        return nm + " = " + exp.toString();
    }
}
