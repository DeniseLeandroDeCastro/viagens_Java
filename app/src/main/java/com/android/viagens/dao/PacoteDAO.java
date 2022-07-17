package com.android.viagens.dao;

import com.android.viagens.model.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteDAO {

    public List<Pacote> lista() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("Praia de Pirangi, RN", "pirangi", 2, new BigDecimal(243.99)),
                new Pacote("Cajueiro de Pirangi, RN", "cajueiro", 3, new BigDecimal(421.50)),
                new Pacote("Praia de Maracajaú, RN, RN", "maracajau", 4, new BigDecimal(754.20)),
                new Pacote("Praia de Pirangi do Norte, RN", "pirangi_do_norte", 6, new BigDecimal(532.55)),
                new Pacote("Praia de Ponta Negra, RN", "ponta_negra", 5, new BigDecimal(899.99)),
                new Pacote("Praia de Cotovelo, RN", "praia_de_cotovelo", 5, new BigDecimal(899.99)),
                new Pacote("Praia de Pipa, RN", "praia_de_pipa", 5, new BigDecimal(899.99)),
                new Pacote("Praia de Santa Rita, RN", "praia_sta_rita", 1, new BigDecimal(289.90)))
        );
        return pacotes;
    }
}
