/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foguete;

/**
 *
 * @author luzinete.amota
 */

//Fabricação

public class FabricaFoguetes {
    
    public static void main(String[] args){
        //set usado para alterar o objeto.
        Foguete foguete1 = new Foguete();
        foguete1.setCor("azul");
        
        Foguete foguete2 = new Foguete();
        foguete2.setCor("branco");
        
        //get usado para chamar o objeto com sua alteração. (imprimir)
        System.out.println(foguete1.getCor());
        System.out.println(foguete2.getCor());
    }
    
}
