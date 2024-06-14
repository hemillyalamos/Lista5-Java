public class Calculo {

    public double calcularMediaAritmetica(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public double calcularMediaPonderada(double nota1, double nota2, int peso1, int peso2) {
        return (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
    }
}
