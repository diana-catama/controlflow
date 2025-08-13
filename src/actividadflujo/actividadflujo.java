package actividadflujo;

import java.util.Scanner;

public class actividadflujo {
    public static void facturacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el total de su compra");
        float total = scanner.nextFloat();
        System.out.println("ingrese la cantidad de productos comprados");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("tiene membresia? (si/no)");
        String membresia = scanner.nextLine();
        double descuento1 = 0;
        double descuento2 = 0;

        switch (membresia.toLowerCase()){
            case "si":
                descuento1 = total * 0.10;
                if (cantidad > 10){
                    descuento2 = total * 0.05;
                }
                break;
            case "no":
                if (cantidad > 10){
                    descuento2 = total * 0.05;
                }
                break;
            default:
                System.out.println("informacion no valida");
        }
        System.out.println("el total de su compra es: " + (total - descuento1 - descuento2));
    }

    public static void veterinaria(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("que animal tienes?");
        String animal = scanner.nextLine();
        System.out.println("cuantos años tiene tu mascota?");
        int edad = scanner.nextInt();

        switch (animal.toLowerCase()){
            case "perro":
                System.out.println("se asigna cita con el veterinario camilo especialista en perros ");
                if (edad > 5){
                    System.out.println("se recomienda una vacunacion adicional");
                }
                break;
            case "gato":
                System.out.println("se asigna cita con la veterinaria maria especialista en gatos ");
                if (edad > 5){
                    System.out.println("se recomienda una vacunacion adicional");
                }
                break;
            case "ave":
                System.out.println("se asigna cita con el veterinario pablo especialista en aves ");
                break;
            default:
                System.out.println("se asigna cita con la veterinaria juana especialista en otros animales");
        }
    }

    public static void parqueadero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es su tipo de vehiculo?");
        String vehiculo = scanner.nextLine();
        System.out.println("ingrese la hora de llegada (formato 24 horas)");
        int hora = scanner.nextInt();
        double tarifa = 0;


        switch (vehiculo.toLowerCase()){
            case "auto":
                tarifa = 7000;
                break;
            case "moto":
                tarifa = 5000;
                break;
            case "bicicleta":
                tarifa = 3000;
                break;
            default:
                System.out.println("informacion no valida");
        }
        if (hora >20){
            tarifa += tarifa * 0.20;
        }
        System.out.println("el costo del parqueo es de: " + tarifa);
    }

    public static void tiendaRopa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la prenda que deseas comprar");
        String prenda = scanner.nextLine();
        System.out.println("ingrese la cantidad de prendas a comprar");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        double descuento = 0;
        int totalCamisa = 9000;
        int totalPantalon = 7000;
        int totalChaqueta = 12000;
        int total;

        switch (prenda.toLowerCase()){
            case "camisa":
                total = totalCamisa * cantidad;
                if (cantidad > 5){
                    descuento = total * 0.15;
                }
                System.out.println("el total de sus camisas es de: " + (total - descuento));
                break;
            case "pantalon":
                total = totalPantalon * cantidad;
                if (cantidad > 5){
                    descuento = total * 0.15;
                }
                System.out.println("el total de sus pantalones es de: " + (total - descuento));
                break;
            case "chaqueta":
                total = totalChaqueta * cantidad;
                if (cantidad > 5){
                    descuento = total * 0.15;
                }
                System.out.println("el total de sus chaquetas es de: " + (total - descuento));
                break;
            default:
                System.out.println("informacion no valida");
        }
    }
}
