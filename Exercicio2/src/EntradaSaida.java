import java.util.Scanner;

public class EntradaSaida {

    private Scanner scanner;

    public EntradaSaida(Scanner scanner) {
        this.scanner = scanner;
    }

    public double lerSalarioBruto() {
        System.out.print("Digite o salário bruto: ");
        return scanner.nextDouble();
    }

    public int lerHorasExtras() {
        System.out.print("Digite a quantidade de horas extras: ");
        return scanner.nextInt();
    }

    public void mostrarFolhaPagamento(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras, double salarioLiquido) {
        System.out.println("\nFolha de Pagamento:");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + descontoINSS);
        System.out.println("Desconto IRPF: R$ " + descontoIRPF);
        System.out.println("Desconto Plano de Saúde: R$ " + descontoPlanoSaude);
        System.out.println("Acrescimo Horas Extras: R$ " + acrescimoHorasExtras);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
