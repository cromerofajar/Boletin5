package boletin5;

public class Conta {

    private String cliente;
    private String conta;
    private double saldo;

    public Conta() {
    }

    public Conta(String cliente, String conta, double saldo) {
        this.cliente = cliente;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setConta(String conta) {

        this.conta = conta;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setIngresos(double saldo) {

        this.saldo = this.saldo + saldo;
        if (saldo<0){
            System.out.println("Error no puede ingresar una cantidad negativa");
            this.saldo= this.saldo - saldo;
        }
            else {                  
            System.out.println("Cantidad ingresada tu saldo actual es de "+ this.saldo);
            }
        }
    

    public void setReintegro(double saldo) {

        this.saldo = this.saldo - saldo;
        if(saldo<0){
            System.out.println("no puede retirar una cantidad negativa");
            this.saldo= this.saldo+saldo;
        }
        else if (this.saldo < 0){
            System.out.println("Error no puede retirar tal cantidad");
            this.saldo= this.saldo + saldo;
        }
        else{
            System.out.println("Cantidad retirada tu saldo actual es de "+ this.saldo);
        }
        }
        

    public void datosCliente() {
        System.out.println("Cliente= " + cliente + ". Conta= " + conta + ". Saldo= " + saldo);
    }

}
