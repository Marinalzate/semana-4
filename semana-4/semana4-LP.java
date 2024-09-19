import java.util.Scanner;

public class SolucionesProblemas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Problema 1: Calculando la propina en un restaurante");


        System.out.print("Ingresa el valor de la cuenta: ");
        double valorCuenta = scanner.nextDouble();

  
        System.out.print("Ingresa el porcentaje de propina que deseas dejar: ");
        double porcentajePropina = scanner.nextDouble();


        double valorPropina = valorCuenta * (porcentajePropina / 100);

       
        double valorTotal = valorCuenta + valorPropina;

 
        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));

        System.out.println("\n");

 
        System.out.println("Problema 2: Calculando el precio de un taxi en Medellín");

  
        System.out.print("Ingresa la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

 
        System.out.print("Ingresa el tiempo de espera en tráfico en minutos: ");
        int tiempoEspera = scanner.nextInt();


        double tarifaBase = 4000;
        double valorKilometro = 900;
        double valorMinuto = 150;

 
        double precioTotal = tarifaBase + (distancia * valorKilometro) + (tiempoEspera * valorMinuto);

       
        System.out.println("Precio del viaje: $" + String.format("%.2f", precioTotal));

        System.out.println("\n"); 

       
        System.out.println("Problema 3: Decodificando un mensaje secreto");

        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        String mensajeReemplazado = mensajeCodificado.replace("0", "o")
                                                     .replace("3", "e")
                                                     .replace("4", "a");

   
        String mensajeSinEspacios = mensajeReemplazado.trim().replaceAll("\\s+", " ");

        String mensajeDecodificado = mensajeSinEspacios.toUpperCase();

    
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);

    
        scanner.close();
    }
}
