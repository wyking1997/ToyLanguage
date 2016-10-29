package Repository;

import Model.PrgState;

/**
 * Created by Wyking on 10/29/2016.
 */
public interface MyIRepository {
    void add(PrgState state);
    PrgState get(int position) throws Exception;
}
