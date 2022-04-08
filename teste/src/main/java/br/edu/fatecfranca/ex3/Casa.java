/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.ex3;

/**
 *
 * @author Lucas
 */
public class Casa extends Imovel {
    private float quintal;

    public Casa() {
    }

    public Casa(float quintal) {
        this.quintal = quintal;
    }

    public Casa(float quintal, String endereco) {
        super(endereco);
        this.quintal = quintal;
    }

    public float getQuintal() {
        return quintal;
    }

    public void setQuintal(float quintal) {
        this.quintal = quintal;
    }
    
    @Override
    public String toString() {
        return " Casa {quintal: " + quintal + "m}" + super.toString();
    }   
}
