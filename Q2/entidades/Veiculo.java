package Q2.entidades;

import Q2.execoes.YearLessThanZero;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        if (ano < 0){
            throw new YearLessThanZero();
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void informacoes(){
        System.out.println("Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}