package com.blackjack.models;

import java.util.ArrayList;
import java.util.List;

public class Jogador{

    //atributos
    private List<Carta> mao ;
    private List<Carta> cartasGanhas ;
    private int pontos;

    //Metodo construtor
    public Jogador(){
        this.mao = new ArrayList<>();
        this.cartasGanhas = new ArrayList<>();
        this.pontos = 0;
    }



}