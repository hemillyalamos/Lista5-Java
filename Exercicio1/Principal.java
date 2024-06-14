public class Principal {

    public static void main(String[] args) {
        EntradaSaida entradaSaida = new EntradaSaida();
        double nota1 = entradaSaida.lerNota("Digite a primeira nota: ");
        double nota2 = entradaSaida.lerNota("Digite a segunda nota: ");

        Calculo calculo = new Calculo();
        String tipoMedia = entradaSaida.lerTipoMedia();

        double media;
        if (tipoMedia.equalsIgnoreCase("aritmetica")) {
            media = calculo.calcularMediaAritmetica(nota1, nota2);
        } else if (tipoMedia.equalsIgnoreCase("ponderada")) {
            int peso1 = entradaSaida.lerPeso("Digite o peso da primeira nota: ");
            int peso2 = entradaSaida.lerPeso("Digite o peso da segunda nota: ");
            media = calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2);
        } else {
            System.out.println("Tipo de média inválido!");
            return;
        }

        Resultado resultado = new Resultado();
        resultado.mostrarAprovacao(media);
    }
}
