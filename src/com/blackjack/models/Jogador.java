package com.blackjack.models;

import java.util.ArrayList;
import java.util.List;

public class Jogador{

    //atributos
    private List<Carta> mao;
    private int tamanhoMao;
    private List<Carta> cartasGanhas;
    private int tamanhoCartasGanhas;
    private int pontos;

    //Metodo construtor
    public Jogador(){
        this.mao = new ArrayList<>();
        this.cartasGanhas = new ArrayList<>();
        this.pontos = 0;
    }

    //Metodo que retorna o tamanho das listas
    public int tamanhoMao(){
        return this.tamanhoMao;
    }

    public int tamanhoCartasGanhas(){
        return this.tamanhoCartasGanhas;
    }
    
    //Metodos getters e setters
    //getters
    public List<Carta> getMao(){
        return this.mao;
    }

    public Carta getCartaMao(Carta c){
        for(Carta carta : mao){
            if(carta.equals(c)){
                return c;
            }
        }
        return null;
    }

    public List<Carta> getCartasGanhas(){
        return this.cartasGanhas;
    }

    public int getPontos(){
        return this.pontos;
    }

    //setters
    public void setMao(List<Carta> cartas){
        this.mao = cartas;
    }

    public void setCartasMao(Carta c){
        this.mao.add(c);
    }

    public void setCartasGanhas(List<Carta> cartas){
        this.cartasGanhas = cartas;
    }

    public void setPontos(int pontos){
        this.pontos = pontos;
    }

}