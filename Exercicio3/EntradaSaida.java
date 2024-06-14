import java.util.Scanner;

public class EntradaSaida {

    private static final Scanner scanner = new Scanner(System.in);

    public double lerSalarioAtual() {
        System.out.print("Digite seu salário atual: ");
        return scanner.nextDouble();
    }

    public double lerValorEmprestimo() {
        System.out.print("Digite o valor que deseja emprestar: ");
        return scanner.nextDouble();
    }
}
