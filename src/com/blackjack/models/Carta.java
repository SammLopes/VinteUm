package com.blackjack.models;

public class Carta {

    //Atributos da carta
    String nipe;
    String face;
    int valor;

    public Carta(String nipe, String face, int valor){
        this.nipe = nipe;
        this.face = face;
        this.valor = valor;
    }

    //Getters:
     public String getNipe(){
        return this.nipe;
     }

     public String getFace(){
        return this.face;
     }

     public int getValor(){
        return this.valor;
     }

     public void setNipe(String nipe){
        this.nipe = nipe;
     }

     public void setFace(String face){
         this.face = face;
     }

     public void setValor(int valor){
         this.valor = valor;
     }
     
}

