public class Calculo {

    private static final double PERCENTUAL_INSS = 0.2;
    private static final double PERCENTUAL_IRPF = 0.1;
    private static final double PERCENTUAL_PLANO_SAUDE = 0.05;

    public double calcularINSS(double salarioBruto) {
        return salarioBruto * PERCENTUAL_INSS;
    }

    public double calcularIRPF(double salarioBruto) {
        return salarioBruto * PERCENTUAL_IRPF;
    }

    public double calcularPlanoSaude(double salarioBruto) {
        return salarioBruto * PERCENTUAL_PLANO_SAUDE;
    }

    public double calcularAcrescimoHorasExtras(int horasExtras, double salarioBruto) {
        double valorHoraNormal = salarioBruto / 160;
        double valorHoraExtra = valorHoraNormal * 1.5;
        return horasExtras * valorHoraExtra;
    }

    public double calcularSalarioLiquido(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras) {
        return salarioBruto - descontoINSS - descontoIRPF - descontoPlanoSaude + acrescimoHorasExtras;
    }
}
