/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.ex1;

/**
 *
 * @author Lucas
 */
public class Computador {

    private boolean ligado;
    private int ram;

    public Computador() {
    }

    public Computador(boolean ligado, int ram) {
        this.ligado = ligado;
        if (ram == 4 || ram == 8 || ram == 16 || ram == 32) {
            this.ram = ram;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram == 4 || ram == 8 || ram == 16 || ram == 32) {
            this.ram = ram;
        }
    }
    
    public void upgradeMemoriaRam(int x){
        if (x == 4 || x == 8 || x == 16 || x == 32) {
            this.ram += x;
        }
    }
}
