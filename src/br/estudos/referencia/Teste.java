package br.estudos.referencia;

public class Teste {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA= "+ intA + " IntB= "+intB);

        intA = 2;
        System.out.println("intA= "+ intA + " IntB= "+intB);

        Referencia refA = new Referencia(1);
        Referencia refB = refA;
        System.out.println("refA= "+ refA + " RefB= "+refB);

        refA.setNum(2);
        System.out.println("refA= "+ refA + " RefB= "+refB);
    }
}
