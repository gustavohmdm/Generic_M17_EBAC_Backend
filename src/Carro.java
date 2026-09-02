/**
 * @author Win
 */

public class Carro<T, E> {

    T carro;
    E cavalos;

    public Carro(T carro, E cavalos) {
        this.carro = carro;
        this.cavalos = cavalos;
    }

    public T getCarro() {
        return carro;
    }

    public E getCavalos() {
        return cavalos;
    }

    @Override
    public String toString() {
        return
                "Carro=" + carro +
                ", Cavalos=" + cavalos;
    }
}
