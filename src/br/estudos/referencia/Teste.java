package br.estudos.referencia;

public class Teste {

    public static void main(String[] args) {

        Referencia intC = new Referencia(1);
        Referencia intD = intC;

        System.out.println("intC= "+ intC.getNum() + " IntD= "+intD.getNum());

        intC.setNum(2);
        System.out.println("intC= "+ intC.getNum() + " IntD= "+intD.getNum());

    }
}

 /*
        int intA = 1;
        int intB = intA;

        System.out.println("intA= "+ intA + " IntB= "+intB);

        intA = 2;
        System.out.println("intA= "+ intA + " IntB= "+intB);
        */
