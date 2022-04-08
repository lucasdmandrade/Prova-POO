/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.ex2;

/**
 *
 * @author Lucas
 */
public class Cliente {
    private String rg, nome;

    public Cliente() {
    }

    public Cliente(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public String getRe() {
        return rg;
    }

    public void setRe(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
