package br.estudos.pilha;

public class Pilha {

    private No refNoEntraPilha;

    public Pilha() {
        this.refNoEntraPilha = null;
    }

    public void push(No newNo){
        No refAuxiliar = refNoEntraPilha; // guardo a referencia de topo
        refNoEntraPilha = newNo; // setando referencia de topo como novo No
        refNoEntraPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntraPilha;
            refNoEntraPilha = refNoEntraPilha.getRefNo();
            return noPoped;
        }

        return null;
    }


    public No top(){
        return refNoEntraPilha;
    }

    public boolean isEmpty(){
      return refNoEntraPilha == null ? true : false;
//      if (refNoEntraPilha == null){
//          return true;
//      }
//      return false;
    }
}
