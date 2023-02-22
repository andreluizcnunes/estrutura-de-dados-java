package br.estudos.referencia;

public class Referencia {

    private int num;

    public Referencia(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Referencia{" +
                "num=" + num +
                '}';
    }
}
