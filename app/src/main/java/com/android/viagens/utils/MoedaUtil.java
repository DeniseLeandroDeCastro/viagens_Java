package com.android.viagens.utils;

import androidx.annotation.NonNull;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    @NonNull
    public static String formataParaBrasileiro(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(
                new Locale("pt", "br"));
        return formatoBrasileiro.format(valor).replace("R$", "R$ ");
    }
}
