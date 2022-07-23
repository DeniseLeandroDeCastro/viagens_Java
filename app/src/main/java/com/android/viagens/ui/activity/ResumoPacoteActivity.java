package com.android.viagens.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.viagens.R;
import com.android.viagens.model.Pacote;
import com.android.viagens.utils.DataUtil;
import com.android.viagens.utils.DiasUtil;
import com.android.viagens.utils.MoedaUtil;
import com.android.viagens.utils.ResourcesUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ResumoPacoteActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Resumo do pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle(TITULO_APPBAR);

        Pacote pacoteNatal = new Pacote(
                "Praia de Pirangi", "pirangi", 2, new BigDecimal("243.99")
        );

        mostraLocal(pacoteNatal);
        mostraImagem(pacoteNatal);
        mostraDias(pacoteNatal);
        mostraPreco(pacoteNatal);
        mostraData(pacoteNatal);
    }

    private void mostraData(Pacote pacote) {
        TextView data = findViewById(R.id.resumo_pacote_data);
        String dataFormatadaDaViagem = DataUtil.periodoEmTexto(pacote.getDias());
        data.setText(dataFormatadaDaViagem);
    }

    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.resumo_pacote_preco);
        String moedaBrasileira = MoedaUtil.formataParaBrasileiro(pacote.getPreco());
        preco.setText(moedaBrasileira);
    }

    private void mostraDias(Pacote pacote) {
        TextView dias = findViewById(R.id.resumo_pacote_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacote.getDias());
        dias.setText(diasEmTexto);
    }

    private void mostraImagem(Pacote pacote) {
        ImageView imagem = findViewById(R.id.resumo_pacote_imagem);
        Drawable drawableDoPacote = ResourcesUtil.devolveDrawable(
                this, pacote.getImagem()
        );
        imagem.setImageDrawable(drawableDoPacote);
    }

    private void mostraLocal(Pacote pacote) {
        TextView local = findViewById(R.id.resumo_pacote_local);
        local.setText(pacote.getLocal());
    }
}