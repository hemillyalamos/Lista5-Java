import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntradaSaida entradaSaida = new EntradaSaida(scanner);

        // Solicitar o salário bruto ao usuário
        double salarioBruto = entradaSaida.lerSalarioBruto();

        // Calcular os descontos de INSS, IRPF e plano de saúde
        Calculo calculo = new Calculo();
        double descontoINSS = calculo.calcularINSS(salarioBruto);
        double descontoIRPF = calculo.calcularIRPF(salarioBruto);
        double descontoPlanoSaude = calculo.calcularPlanoSaude(salarioBruto);

        // Solicitar as horas extras ao usuário
        int horasExtras = entradaSaida.lerHorasExtras();

        // Calcular o acréscimo das horas extras
        double acrescimoHorasExtras = calculo.calcularAcrescimoHorasExtras(horasExtras, salarioBruto);

        // Calcular o salário líquido
        double salarioLiquido = calculo.calcularSalarioLiquido(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras);

        // Mostrar a folha de pagamento
        entradaSaida.mostrarFolhaPagamento(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras, salarioLiquido);
    }
}
