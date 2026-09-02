import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro<String, Integer>> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro<>("Corola", 100));
        listaCarros.add(new Carro<>("Brasilia", 200));

        imprimir(listaCarros);

    }

    public static <T, E> void imprimir(List<Carro<T, E>> carros) {
        for(Carro<T, E> carro : carros) {
            System.out.println(carro);
        }
    }
}