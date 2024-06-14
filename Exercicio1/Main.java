import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1 = lerNota("Digite a primeira nota: ");
        double nota2 = lerNota("Digite a segunda nota: ");
        String tipoMedia = lerTipoMedia();

        double media;

        if (tipoMedia.equalsIgnoreCase("aritmetica")) {
            media = calcularMediaAritmetica(nota1, nota2);
        } else if (tipoMedia.equalsIgnoreCase("ponderada")) {
            int peso1 = lerPeso("Digite o peso da primeira nota: ");
            int peso2 = lerPeso("Digite o peso da segunda nota: ");
            media = calcularMediaPonderada(nota1, nota2, peso1, peso2);
        } else {
            System.out.println("Tipo de média inválido!");
            return;
        }

        mostrarResultado(media);
    }

    private static double lerNota(String mensagem) {
        double nota;
        do {
            System.out.print(mensagem);
            nota = scanner.nextDouble();
        } while (!validarNota(nota));
        return nota;
    }

    private static int lerPeso(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    private static String lerTipoMedia() {
        System.out.print("Digite o tipo de média (aritmetica/ponderada): ");
        return scanner.next();
    }

    private static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    private static double calcularMediaAritmetica(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    private static double calcularMediaPonderada(double nota1, double nota2, int peso1, int peso2) {
        return (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
    }

    private static void mostrarResultado(double media) {
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
