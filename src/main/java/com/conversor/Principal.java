package alura;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        ConversorDeMoedas conversor = new ConversorDeMoedas();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n ****** Conversor de Moedas ****** ");
            System.out.println("\nPlanejando suas compras internacionais? ");
            System.out.println("Utilize nosso Conversor de Moedas para");
            System.out.println("calcular com precisão e planejar suas despesas!");
            System.out.println("\n1. USD para BRL");
            System.out.println("2. EUR para BRL");
            System.out.println("3. GBP para BRL");
            System.out.println("4. AUD para BRL");
            System.out.println("5. CAD para BRL");
            System.out.println("6. JPY para BRL");
            System.out.println("7. Customizar conversão");
            System.out.println("8. Exibir histórico de conversões");
            System.out.println("9. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = leitura.nextInt();
            leitura.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1 -> conversor.converterMoeda("USD", "BRL");
                case 2 -> conversor.converterMoeda("EUR", "BRL");
                case 3 -> conversor.converterMoeda("GBP", "BRL");
                case 4 -> conversor.converterMoeda("AUD", "BRL");
                case 5 -> conversor.converterMoeda("CAD", "BRL");
                case 6 -> conversor.converterMoeda("JPY", "BRL");
                case 7 -> {
                    System.out.println("Informe a moeda da qual deseja converter: EX: USD, EUR, BRL");
                    String converterDe = leitura.nextLine();
                    System.out.println("Informe a moeda para a qual deseja converter?");
                    String converterPara = leitura.nextLine();
                    conversor.converterMoeda(converterDe, converterPara);
                }
                case 8 -> {
                    conversor.exibirHistorico();
                    System.out.print("Deseja realizar outra cotação? (s/n): ");
                    String resposta = leitura.nextLine();
                    if (!resposta.equalsIgnoreCase("s")) {
                        continuar = false;
                    }
                }
                case 9 -> continuar = false;
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

            if (continuar && opcao != 8) {
                System.out.print("Deseja realizar outra cotação? (s/n): ");
                String resposta = leitura.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            }
        }
        leitura.close();
        System.out.println("Programa encerrado com sucesso.");
    }
}
