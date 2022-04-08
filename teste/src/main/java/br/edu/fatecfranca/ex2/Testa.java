/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.ex2;

import java.util.Date;

/**
 *
 * @author Lucas
 */
public class Testa {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("57879767-7", "Lucas");
        Unidade u1 = new Unidade("Franca", "SP");
        Pedido p1 = new Pedido(578,new Date() ,c1, u1);
        
        System.out.println(p1);
    }
}
