package Aula24.interfac;

import java.util.Arrays;

public class Vetor implements Lista{
    private String[] elementos;
    private int tamanho;

    public Vetor(){
        tamanho = 0;
        elementos = new String[10];
    }
    @Override
    public void adciona() {
        if(tamanho<0)
            tamanho++;
    }

    @Override
    public void remove() {
        if (tamanho>0)
            tamanho--;
    }
    public int obterTamanho(){
        return tamanho;
    }
    public String toString(){
        String retorno = "i";
        if(tamanho>0){
            for(int i=0;i<tamanho;i++){
                retorno += elementos[i]+", ";
            }
        }
        return retorno;
    }
}
