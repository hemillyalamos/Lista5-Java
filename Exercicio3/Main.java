import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EntradaSaida entradaSaida = new EntradaSaida();
        double salarioAtual = entradaSaida.lerSalarioAtual();
        double valorEmprestimo = entradaSaida.lerValorEmprestimo();

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.simularEmprestimo(salarioAtual, valorEmprestimo);
    }
}


