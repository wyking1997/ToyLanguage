package Model;

import utils.MyException;
import utils.MyIFileTable;
import utils.Pair;

import java.io.BufferedReader;
import java.lang.reflect.MalformedParameterizedTypeException;

/**
 * Created by Wyking on 11/5/2016.
 */
public class CloseRFile implements IStm {

    Exp var_file_id;

    public CloseRFile(Exp var_file_id) {
        this.var_file_id = var_file_id;
    }

    public PrgState execute(PrgState state) throws Exception {

        int file_id = var_file_id.eval(state.getExDict());
        MyIFileTable<Integer, Pair<String,BufferedReader>> fileTable = state.getExFlTable();
        if (!fileTable.containsKey(file_id))
            throw new MyException("There is no file associated to the given 'var_file_id'= " + file_id);
        BufferedReader bf = fileTable.get(file_id).getSecondEl();
        bf.close();
        fileTable.remove(file_id);
        return state;
    }

    public String toString(){
        return "closeRFile(" + var_file_id + ")";
    }
}
