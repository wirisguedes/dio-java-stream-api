import java.util.List;
import java.util.stream.Stream;

public class Supplier {

    public static void main(String[] args) {

        List<String> listaSaudacoes = Stream.generate(() -> "Olá seja bem vindo")
                .limit(4)
                .toList();
        listaSaudacoes.forEach(System.out::println);
    }


}
