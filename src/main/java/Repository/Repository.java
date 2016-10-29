package Repository;

import Model.PrgState;
import utils.MyException;

import java.util.ArrayList;

/**
 * Created by Wyking on 10/29/2016.
 */
public class Repository implements MyIRepository {

    ArrayList<PrgState> ls;

    public Repository(){
        ls = new ArrayList<PrgState>();
    }

    public void add(PrgState state) {

        ls.add(state);
    }

    public PrgState get(int position) throws Exception{

        if (position < 0 || position > ls.size())
            throw new MyException("Index out of bounds!");
        return ls.get(position);
    }
}
