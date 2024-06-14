import java.text.DecimalFormat;

public class Emprestimo {

    private static final double JUROS = 0.35;
    private static final int NUM_PARCELAS = 24;

    public void simularEmprestimo(double salarioAtual, double valorEmprestimo) {
        double totalJuros = valorEmprestimo * JUROS;
        double valorTotal = valorEmprestimo + totalJuros;
        double parcela = valorTotal / NUM_PARCELAS;

        if (Validacao.validarValorEmprestimo(valorEmprestimo) && Validacao.validarParcela(parcela, salarioAtual)) {
            DecimalFormat df = new DecimalFormat("#,###.##");
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor de cada parcela: R$ " + df.format(parcela));
            System.out.println("Total a ser pago: R$ " + df.format(valorTotal));
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
    }
}
