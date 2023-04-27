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
    private String nome;

    //Metodo construtor com parametro 
    public Jogador(String nome ,List<Carta> mao, List<Carta> cartasGanhas ) {
        this.nome = nome;
        this.mao = mao;
        this.cartasGanhas = cartasGanhas;
        this.pontos = 0;
    }

    //Metodo construtor
    public Jogador(){
        this.mao = new ArrayList<>();
        this.cartasGanhas = new ArrayList<>();
        this.pontos = 0;
        this.nome = "";
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

    public String getNome(){
        return this.nome;
    }

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

    public void setNome(String nome){
        this.nome = nome;
    }

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

    //Metodo toString da classa jogador
    @Override
    public String toString(){
        return "Jogador: "+this.nome+" Mão = {"+this.mao+"}";
    }
}