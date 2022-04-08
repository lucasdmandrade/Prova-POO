/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.ex3;

/**
 *
 * @author Lucas
 */
public class Apto extends Imovel {
    private int nro;

    public Apto() {
    }

    public Apto(int nro) {
        this.nro = nro;
    }

    public Apto(int nro, String endereco) {
        super(endereco);
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    @Override
    public String toString() {
        return " Apatamento {numero: " + nro + '}' + super.toString();
    }
}
