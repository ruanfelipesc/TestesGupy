/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

/**
 *
 * @author ruanb
 */
public class Transporte4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double distRaF = 100.0;//distância entre as cidades
        double velCar = 110.0; // velocidade constante do carro
        double velCam = 80.0; // velocidade constante do caminhão
        double te;
        double SCarro,SCaminhao;
        System.out.println("Função horária  S(t)=So + v*t");
        System.out.println("SoCarro = 0; v=110km/h; assim: S(t)= 0 +110*t");
        System.out.println("SoCaminhão = 100km; v= -80km/h; assim: S(t)= 0 + (80)*t");
        System.out.println("O encontro do carro com o caminhão será no instante; 110te=100-80te: ");
        System.out.print(te=(distRaF/(velCar+velCam)) );
        System.out.println();
        System.out.println("O carro estará na posição em relação a Ribeirão Preto, em km: ");
        System.out.print(SCarro=velCar*te);
        System.out.println("");
        System.out.println("O caminhão estará na posição em relação a Ribeirão Preto, em km: ");
        System.out.print(SCaminhao=velCam*(te+0.16));
        System.out.println("Portanto o veículo mais próximo da cidade de Ribeirão Preto é o caminhão.");
    }
    
}
