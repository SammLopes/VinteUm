package com.blackjack.models;

import java.util.ArrayList;
import java.util.List;

public class Baralho {

    private List<Carta> baralho = new ArrayList<>(); 
    private boolean embaralhar;
    private int tamanhoMonte;
    private boolean dobrar = false;

    public Baralho(){
        String[] nipe = {"Copas","Espadas","Ouros","Paus"};
        String[] face = {"As","2","3","4","5","6","7","8","9","10","Q","J","K"};
        int[] valor =   {  1,  2,  3,  4,  5,  6,  7,  8,  9,  10,  10, 10, 10};

        for(int i = 0; i < nipe.length;i++){
            for(int j = 0; j < face.length; j++){
                baralho.add(new Carta(nipe[i], face[j], valor[j]));
            }
        }
        this.tamanhoMonte = this.baralho.size();
    }

    public int dobrarTamanhoMonte(){
        if(dobrar == true  ){
            return tamanhoMonte * 2; 
        }
        return tamanhoBaralho();
    }
    
    public int tamanhoBaralho(){
        return this.baralho.size();
    }

    public int tamanhoMonte(){
        return tamanhoMonte;
    }

    public Carta compCarta(){
        try {
            return compCartaExc();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Carta compCartaExc() throws Exception{
        this.tamanhoMonte--;
        if(this.tamanhoBaralho() == 0){
            throw new Exception("Fim do baralho");
        }   
        return obterCartaPosicao(0);
    }


    public Carta obterCartaPosicao(int pos){
        if(this.embaralhar){
            if(tamanhoBaralho() == 1){
                Carta c = this.baralho.get(0);
                this.baralho.remove(0);
                return c ;
            }
            int indx = cartaAleatoria();
            Carta c = this.baralho.get(indx);
            this.baralho.remove(indx);
            return c;
        }else{
            Carta c = this.baralho.get(pos);
            this.baralho.remove(pos);
            return c;
        }
    }

    private int cartaAleatoria() {
        return (int) Math.floor(Math.random() * tamanhoBaralho());
    }

    public boolean embaralhar(){
        return embaralhar = true;
    }
}
