package br.estudos.vetor;

public class Teste {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");


        System.out.println(vetor.busca(2));


//        System.out.println(vetor.tamanho());
//        System.out.println(vetor);



// usando com opção 2 da classe Vetor
//        try {
//
//            vetor.adiciona("Elemento 1");
//            vetor.adiciona("Elemento 2");
//            vetor.adiciona("Elemento 3");
//        }catch (Exception e){
//            e.printStackTrace();
//        }


        /*
        Vetor vetor = new Vetor(5);
        int i = 0;
        i++;

         */
    }
}
