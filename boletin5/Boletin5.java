package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta Datos = new Conta();
        System.out.println("Introduzca cliente:");
        Datos.setCliente(ler.next());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Introduzca conta:");
        Datos.setConta(ler.next());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Conta= " + Datos.getConta());
        System.out.println("Introduzca saldo:");
        Datos.setSaldo(ler.nextDouble());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Conta= " + Datos.getConta());
        System.out.println("Saldo= " + Datos.getSaldo());
        System.out.println("Introduzca cantidad a añadir:");
        Datos.setIngresos(ler.nextDouble());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Conta= " + Datos.getConta());
        System.out.println("Saldo= " + Datos.getSaldo());
        System.out.println("Introzduzca cantidad a retirar:");
        Datos.setReintegro(ler.nextDouble());
        Datos.datosCliente();
    }

}
