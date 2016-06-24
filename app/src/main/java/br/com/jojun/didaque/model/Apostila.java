package br.com.jojun.didaque.model;

import java.util.List;

/**
 * Created by josafasouza on 07/06/16.
 */
public class Apostila {
    public String nome;
    public int imagem;
    public List<Licao> licoes;

    public Apostila(){}

    public Apostila(String nome, int imagem){
        this.nome = nome;
        this.imagem = imagem;
    }

    public Apostila(String nome, int imagem, List<Licao> licoes) {
        this.nome = nome;
        this.imagem = imagem;
        this.licoes = licoes;
    }
}
