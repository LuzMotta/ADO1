/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.foguete;

/**
 *
 * @author luzinete.amota
 */

// Projeto
public class Foguete {
    
    //Atributos - caracteristicas das variaveis.
    private String modelo = "";
    private String cor = "";
    private static String marca = "SENAC";
    private long altitudeMetros = 0;

    
    //Ações - Métodos.
    public void decolar(){
        this.altitudeMetros = 50000;
    }
    
    public void pousar(){
        this.altitudeMetros = 0;
    }
    
    //Construtor
    public Foguete(){
        
    }
    
    public void setCor(String novaCor){
        this.cor = novaCor;
    }
    
    public String getCor(){
        return cor;
    }
    
    
    
    
}
