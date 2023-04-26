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
     
     @Override
     public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((nipe == null) ? 0 : nipe.hashCode());
       result = prime * result + ((face == null) ? 0 : face.hashCode());
       result = prime * result + valor;
       return result;
     }
     
     @Override
     public boolean equals(Object obj) {
       if (this == obj)
          return true;
       if (obj == null)
          return false;
       if (getClass() != obj.getClass())
          return false;
       Carta other = (Carta) obj;
       if (nipe == null) {
          if (other.nipe != null)
             return false;
       } else if (!nipe.equals(other.nipe))
          return false;
       if (face == null) {
          if (other.face != null)
             return false;
       } else if (!face.equals(other.face))
          return false;
       if (valor != other.valor)
          return false;
       return true;
     }
}

