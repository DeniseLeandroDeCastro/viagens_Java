package com.android.viagens.utils;

import androidx.annotation.NonNull;

public class DiasUtil {

    public static final String SINGULAR = "dia";
    public static final String PLURAL = SINGULAR + "s";

    @NonNull
    public static String formataEmTexto(int quantidadeDeDias) {
        if (quantidadeDeDias > 1) {
            return quantidadeDeDias + " " + PLURAL;
        }
        return quantidadeDeDias + " " + SINGULAR;
    }
}
