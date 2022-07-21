package com.android.viagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.viagens.R;
import com.android.viagens.model.Pacote;
import com.android.viagens.utils.DiasUtil;
import com.android.viagens.utils.MoedaUtil;
import com.android.viagens.utils.ResourcesUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle("Resumo do pacote");

        Pacote pacoteNatal = new Pacote(
                "Praia de Pirangi", "pirangi", 2, new BigDecimal("243.99")
        );

        TextView local = findViewById(R.id.resumo_pacote_local);
        local.setText(pacoteNatal.getLocal());

        ImageView imagem = findViewById(R.id.resumo_pacote_imagem);
        Drawable drawableDoPacote = ResourcesUtil.devolveDrawable(
                this, pacoteNatal.getImagem()
        );
        imagem.setImageDrawable(drawableDoPacote);

        TextView dias = findViewById(R.id.resumo_pacote_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacoteNatal.getDias());
        dias.setText(diasEmTexto);

        TextView preco = findViewById(R.id.resumo_pacote_preco);
        String moedaBrasileira = MoedaUtil.formataParaBrasileiro(pacoteNatal.getPreco());
        preco.setText(moedaBrasileira);

        TextView data = findViewById(R.id.resumo_pacote_data);
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, pacoteNatal.getDias());
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM");
        String dataFormatadaIda = formatoBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolta = formatoBrasileiro.format(dataVolta.getTime());
        String dataFormatadaDaViagem =
                dataFormatadaIda + "-"
                + dataFormatadaVolta
                + "de " + dataVolta.get(Calendar.YEAR);
        data.setText(dataFormatadaDaViagem);
    }
}