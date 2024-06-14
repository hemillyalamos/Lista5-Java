public class Validacao {

    private static final double LIMITE_PARCELA = 0.15;
    private static final double LIMITE_VALOR_EMPRESTIMO = 200000;

    public static boolean validarParcela(double parcela, double salarioAtual) {
        return parcela <= (salarioAtual * LIMITE_PARCELA);
    }

    public static boolean validarValorEmprestimo(double valorEmprestimo) {
        return valorEmprestimo <= LIMITE_VALOR_EMPRESTIMO;
    }
}
