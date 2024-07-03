package alura;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConversorDeMoedas {
    private final ApiHelper apiHelper = new ApiHelper();
    private final List<Conversao> historico = new ArrayList<>();

    public void converterMoeda(String converterDe, String converterPara) throws IOException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o valor que precisa converter: ");
        BigDecimal quantidade = leitura.nextBigDecimal();

        BigDecimal cambio = apiHelper.obterTaxaCambio(converterDe, converterPara);

        // Formatar o resultado com separador decimal correto
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        String resultadoFormatadoStr = df.format(cambio);
        BigDecimal resultadoFormatado = new BigDecimal(resultadoFormatadoStr);

        BigDecimal resultado = resultadoFormatado.multiply(quantidade);

        Conversao conversao = new Conversao(converterDe, converterPara, quantidade, resultado);
        historico.add(conversao);

        System.out.println("O resultado da sua conversão é: " + resultado + " " + converterPara);
    }

    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
        } else {
            System.out.println("\nHistórico de conversões:");
            for (Conversao conversao : historico) {
                System.out.println(conversao);
            }
        }
    }
}
