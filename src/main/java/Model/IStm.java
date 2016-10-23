package Model;

/**
 * Created by Wyking on 10/23/2016.
 */
public interface IStm {
    public PrgState execute(PrgState state);
    public String toString();
}
