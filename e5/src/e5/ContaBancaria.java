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
public class ContaBancaria {
      private final int identificadorConta;
    private final String titular;
    private float saldo;
    private String movemento;
    private static int counter = 0;
    private final float saldo_Minimo;
    private static String nomeBanco;
    Banco vinculado ;
    
    /**
     * 
     * @param identificadorConta
     * @param titular
     * @param saldo 
     */
   
     public ContaBancaria(int identificadorConta, String titular,String nomebanco,Banco vinculado){
        this.identificadorConta = identificadorConta;
        this.titular=titular;
        this.saldo=0;
        ++counter; 
        this.saldo_Minimo =0;
        nomeBanco = nomebanco ;
     }
    
    public ContaBancaria(int identificadorConta, String titular, float saldo,String nomebanco,Banco vinculado){
         this.identificadorConta = identificadorConta;
        this.titular=titular;
        this.saldo=saldo;
        ++counter;
        this.saldo_Minimo =0;
        nomeBanco = nomebanco ;
    }
    
   public ContaBancaria(int identificadorConta, String titular, float saldo, float saldo_Minimo,String nomebanco) {
        this.identificadorConta = identificadorConta;
        this.titular=titular;
        this.saldo=saldo;
        ++counter;
        this.saldo_Minimo = saldo_Minimo;
        nomeBanco = nomebanco ;
   }     

    /**
     *
     */
   
    // NO COMPREDO EL GETTER Y SETTER //
    
   /**
    * 
    * @return 
    */
   
    public int getidentificadorConta() {
        return identificadorConta;
    }
    


    public String getTitular() {
        return titular;
    }

   

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String getmovemento() {
        return movemento;
    }
    
    public void setmovemento(String movemento)  {
        this.movemento = movemento;
    }   

    public static String getNomeBanco() {
        return nomeBanco;
    }

    public static void setNomeBanco(String nomeBanco) {
        ContaBancaria.nomeBanco = nomeBanco;
    }
    
    /**
     * 
     * @param tipomovemento
     * @param valor
     * @param concepto
     * @return 
     */
    
    
     public byte movemento(float valor,String concepto){
        byte saida = 0;
        boolean tipomovemento = true;
        if (tipomovemento) {
            saldo = saldo + valor;
        } else{
         saldo = saldo - valor;   
        }
        
        this.movemento = concepto;
        
        if(saldo <= 0 && saldo >= -50) {
            System.out.println("ATENCION: Saldo negativo");
        }
        
        
        return saida;
        
            
    }
    
    
    
    public byte movemento(boolean tipomovemento,float valor,String concepto){
        byte saida = 0;
        
        if (tipomovemento) {
            saldo = saldo + valor;
        } else{
         saldo = saldo - valor;   
        }
        
        this.movemento = concepto;
        
        if(saldo <= 0 && saldo >= -50) {
            System.out.println("ATENCION: Saldo negativo");
        }
        
        
        return saida;
        
            
    }
    
    /**
     * 
     */
    
    public String toString(){
        String strin=" ";
        strin +="++++++++++++++++++++++++++\b";
        strin +=" "+identificadorConta+" \b";
       strin += " "+ titular+" \b";
        strin+=" "+saldo+" \b";
        strin +="++++++++++++++++++++++++++\b";
        return strin;
    }
    
    /**
     * 
     * @param cantidad
     * @param destino
     * @param concepto
     * @return 
     */
    
    public byte transferencia (boolean tipo,float cantidad,ContaBancaria destino,String concepto) {
        byte saida = 0;
        
        if (cantidad > 0){
            destino.movemento(tipo,cantidad,concepto);
            movemento(!tipo,cantidad,concepto);
        }
            
      
        
        
        return saida;
        
    }
    
    public static void transferenciaStatic(boolean tipo,float cantidad,ContaBancaria destino1,ContaBancaria destino2,String concepto) {
        if (cantidad > 0){
            destino1.movemento(tipo,cantidad,concepto);
            destino2.movemento(!tipo,cantidad,concepto);
        
        }
    }
}
