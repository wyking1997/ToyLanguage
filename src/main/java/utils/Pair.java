package utils;

/**
 * Created by Wyking on 11/2/2016.
 */
public class Pair<S,T> {
    S firstEl;
    T secondEl;

    public Pair(S firstEl, T secondEl) {
        this.firstEl = firstEl;
        this.secondEl = secondEl;
    }

    public S getFirstEl() {
        return firstEl;
    }

    public void setFirstEl(S firstEl) {
        this.firstEl = firstEl;
    }

    public T getSecondEl() {
        return secondEl;
    }

    public void setSecondEl(T secondEl) {
        this.secondEl = secondEl;
    }

    public String toString(){
        return firstEl.toString();
    }
}
