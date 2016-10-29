package Controller;

import Model.IStm;
import Model.PrgState;
import Repository.MyIRepository;
import utils.MyIStack;

/**
 * Created by Wyking on 10/29/2016.
 */
public class Controller {

    MyIRepository repo;

    public Controller(MyIRepository r){
        repo = r;
    }

    public void add(PrgState state){
        repo.add(state);
    }

    public void executeOneStep() throws Exception{
        PrgState state = repo.get(0);
        MyIStack<IStm> stack = state.getExStack();
        IStm statement = stack.pop();
        statement.execute(state);
        System.out.println(state + "\n\n");
    }

    public void executeAllStep() throws Exception {
        PrgState state = repo.get(0);
        MyIStack<IStm> stack = state.getExStack();

        while (!stack.isEmpty())
            executeOneStep();

    }
}
