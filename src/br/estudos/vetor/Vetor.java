package br.estudos.vetor;

public class Vetor{

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }

//    public void adiciona(String elemento) throws Exception{
//        if(tamanho < elementos.length){
//            elementos[tamanho] = elemento;
//            tamanho++;
//        }else{
//            throw new Exception("Vetor já está cheio, não é possivel adicionar mais elementos.");
//        }
//    }


// OPÇÃO COM BOOLEAN
    public boolean adiciona(String elemento){
        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }


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
