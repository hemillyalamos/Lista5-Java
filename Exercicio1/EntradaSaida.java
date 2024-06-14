import java.util.Scanner;

public class EntradaSaida {

    private Scanner scanner;

    public EntradaSaida() {
        scanner = new Scanner(System.in);
    }

    public double lerNota(String mensagem) {
        double nota;
        do {
            System.out.print(mensagem);
            nota = scanner.nextDouble();
        } while (!Validacao.validarNota(nota));
        return nota;
    }

    public int lerPeso(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public String lerTipoMedia() {
        System.out.print("Digite o tipo de média (aritmetica/ponderada): ");
        return scanner.next();
    }
}
