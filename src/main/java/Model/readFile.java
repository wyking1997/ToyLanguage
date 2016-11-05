package Model;

import utils.*;

import java.io.BufferedReader;

/**
 * Created by Wyking on 11/5/2016.
 */
public class readFile implements IStm {

    Exp var_file_id;
    String var_name;

    public readFile(Exp var_file_id, String var_name) {
        this.var_file_id = var_file_id;
        this.var_name = var_name;
    }

    public PrgState execute(PrgState state) throws Exception {
        int file_id = var_file_id.eval(state.getExDict());
        MyIFileTable<Integer, Pair<String,BufferedReader>> fileTable = state.getExFlTable();
        if (!fileTable.containsKey(file_id))
            throw new MyException("There is no file associated to the given 'var_file_id'= " + file_id);
        BufferedReader bf = fileTable.get(file_id).getSecondEl();
        String data1 = bf.readLine();
        int data;
        if (data1 == null)
            data = 0;
        else
            try {
                data = Integer.parseInt(data1);
            } catch (NumberFormatException e) {
                throw new MyException("The file with the FILE_ID= " + file_id + " contains unsuported data!");
            }
        MyIDictionary<String, Integer> sbTable = state.getExDict();
        sbTable.put(var_name,data);
        return state;
    }

    public String toString(){
        return "readFile(" + var_file_id.toString() + ", " + var_name + ")";
    }
}
