/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e5;

/**
 *
 * @author a21pablorl
 */
public class Banco {
    public final String nome;
    int capital;
    String direccionCentral;
    
    public Banco (String nome) {
      this.nome = nome;  
      capital = 5200000;
      direccionCentral = "Direcion descoñecida";
    }
    
    public Banco (String nome,int capital) {
        this.nome=nome;
        this.capital = capital;
        direccionCentral = "Direcion descoñecida";
    }
    
    public Banco (String nome, String direccion){
        this.nome=nome;
        direccionCentral = direccion;
        capital = 5200000;
    }
    
    
    public Banco (String nome ,int capital,String direccion) {
        this.nome = nome;
        this.capital = capital;
        direccionCentral = direccion;
        
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getDireccionCentral() {
        return direccionCentral;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }
    
    
}
