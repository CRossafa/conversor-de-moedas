package com.conversor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversao {
    private String de;
    private String para;
    private BigDecimal quantidade;
    private BigDecimal resultado;
    private LocalDateTime dataHora;

    public Conversao(String de, String para, BigDecimal quantidade, BigDecimal resultado) {
        this.de = de;
        this.para = para;
        this.quantidade = quantidade;
        this.resultado = resultado;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataFormatada = dataHora.format(formatter);
        return "Conversão: " + quantidade + " " + de + " para " + resultado + " " + para + " em " + dataFormatada;
    }
}
