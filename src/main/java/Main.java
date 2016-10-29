import Controller.Controller;
import Model.*;
import Repository.Repository;
import utils.*;

/**
 * Created by Wyking on 10/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        Repository repo = new Repository();
        Controller c = new Controller(repo);

        //building our prg state
        MyIStack<IStm> stack = new ExecutionStack<IStm>();
        MyIDictionary<String, Integer> smbTable = new ExecutionDictionary<String, Integer>();
        MyIOut<Integer> out = new ExecutionOut<Integer>();

        IStm stm1 = new CompStm(new PrintStm(new ConstExp(10)), new PrintStm(new ConstExp(100)));
        stack.push(stm1);

        PrgState state = new PrgState(stack, smbTable, out);

        c.add(state);

        try {
            c.executeAllStep();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
