package br.com.jojun.didaque.util;

import java.util.ArrayList;
import java.util.List;

import br.com.jojun.didaque.R;
import br.com.jojun.didaque.model.Apostila;
import br.com.jojun.didaque.model.Licao;

/**
 * Created by Josafá on 23/06/2016.
 */
public class ApostilaUtil {
    public static List<Apostila> getApostilas() {

        List<Apostila> list = new ArrayList<>();
        list.add(new Apostila("Princípios Elementares", R.drawable.principios, getLicoes()));
        list.add(new Apostila("Propósito Eterno de Deus", R.drawable.proposito, getLicoes()));
        list.add(new Apostila("Vida em Cristo", R.drawable.cristo, getLicoes()));
        list.add(new Apostila("Comunhão com Deus", R.drawable.comunhao, getLicoes()));
        list.add(new Apostila("Evangelho do Reino", R.drawable.evangelho, getLicoes()));
        list.add(new Apostila("Família", R.drawable.familia, getLicoes()));
        return list;
    }

    private static List<Licao> getLicoes(){
        List<Licao> list = new ArrayList<>();
        list.add(new Licao("Jesus existia antes de todas as coisas", "No princípio era o Verbo... Jo 1:1-3"));
        list.add(new Licao("Tornou-se homem", "Cristo Jesus subsistindo... Fp 2:6-8"));
        list.add(new Licao("Sua vida foi perfeita e irrepreensível", "O qual não cometeu pecado nem... 1Pe 2:22"));
        return list;
    }
}
