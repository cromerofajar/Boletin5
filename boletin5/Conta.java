
package boletin5;

public class Conta {
    private String cliente;
    private String conta;
    private double saldo;
    
    public Conta(){}
    public Conta(String cliente, String conta, double saldo){
    this.cliente= cliente;
    this.conta= conta;
    this.saldo=saldo;
    }
    public void setCliente (String cliente){
    this.cliente=cliente;
    }
    public void setConta (String conta){
    
    this.conta=conta;
    }
    public void setSaldo (double saldo){
    
    this.saldo=saldo;
    }
    public String getCliente (){
    return cliente;
    }
    public String getConta(){
    return conta;
    }
    public double getSaldo(){
    return saldo;
    }
    public void setIngresos(double saldo){
    
    this.saldo=this.saldo+saldo;
    }
    public void setReintegro (double saldo){
    
    this.saldo=this.saldo-saldo;
    }
    public void datosCliente(){
    System.out.println("Cliente= "+cliente+". Conta= "+ conta+". Saldo= "+saldo);
    }
    
}
