package Repository;

import Model.PrgState;
import utils.MyException;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Wyking on 10/29/2016.
 */
public class Repository implements MyIRepository {

    ArrayList<PrgState> ls;
    private String file_name;

    public Repository(String output_file){

        ls = new ArrayList<PrgState>();
        file_name = output_file;
    }
    public Repository(){

        this("default");
    }

    public void add(PrgState state) {

        ls.add(state);
    }

    public PrgState get(int position) throws Exception{

        if (position < 0 || position > ls.size())
            throw new MyException("Index out of bounds!");
        return ls.get(position);
    }

    public void write_to_file(String data) throws Exception{
        File file;
        PrintWriter pw;
        try{
            file = new File(file_name);
            if (!file.exists())
                file.createNewFile();
            pw = new PrintWriter(file);
        }catch(Exception E){
            throw new MyException("EROR AT PRINTWRITER");
        }

        pw.append("\n" + data + "\n");
        pw.close();
    }
}
