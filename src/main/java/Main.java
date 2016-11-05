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
        IStm stm22 = new CompStm(new AssingnStm("a", new ConstExp(10)), new CompStm(new AssingnStm("b", new ConstExp(45)),
                                                            new PrintStm(new ArithExp(new VarExp("a"), new VarExp("b"), '+'))));
        IStm stm23 = new CompStm(stm22, new PrintStm(new ArithExp(new VarExp("a"), new VarExp("b"), '-')));
        IStm stm24 = new CompStm(stm23, new PrintStm(new ArithExp(new VarExp("a"), new VarExp("b"), '*')));
        IStm stm2 = new CompStm(stm24, new PrintStm(new ArithExp(new VarExp("a"), new VarExp("b"), '/')));
        IStm stm3 = new IfStm(new ArithExp(new VarExp("a"), new VarExp("b"), '+'), new PrintStm(new ConstExp(1)),
                                                            new PrintStm(new ConstExp(0)));
        IStm stm4 = new CompStm(stm2,stm3);

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
