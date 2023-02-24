package br.estudos.vetor;

import java.util.Arrays;

public class Vetor{

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }


    //retorna o tamanho do vetor
    public int tamanho(){
        return this.tamanho;
    }


    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

    //retorna o dado pela a base do indici
    public String busca(int posicao){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }


//DESTA FORMA FUNCIONA MAS NÃO É TÃO EFICIENTE
//    @Override
//    public String toString() {
//
//        String s = "[";
//
//        for(int i=0; i < this.tamanho-1; i++){
//            s += this.elementos[i];
//            s += ", ";
//        }
//
//        if(this.tamanho > 0){
//            s += this.elementos[this.tamanho-1];
//        }
//
//        s += "]";
//
//        return Arrays.toString(elementos);
//    }


// adiciona um elemento no vetor
    // OPÇÃO 3 COM BOOLEAN
    public boolean adiciona(String elemento){
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    // opção 2
//    public void adiciona(String elemento) throws Exception{
//        if(tamanho < elementos.length){
//            elementos[tamanho] = elemento;
//            tamanho++;
//        }else{
//            throw new Exception("Vetor já está cheio, não é possivel adicionar mais elementos.");
//        }
//    }


    //OPÇÃO 1 FUNCIONA PARA VETORES PEQUENOS
    // PARA VETORES GRANDES FUNCIONA MAS NÃO É EFICIENTE.
//---------------------------------------------------------
//    public void adiciona(String elemento){
//        for (int i = 0; i < this.elementos.length; i++){
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }
}
