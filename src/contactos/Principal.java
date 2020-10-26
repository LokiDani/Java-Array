package contactos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) { //Static es algo que puedes llamar con una clase y no hace falta un objeto
        //Array de 50 contactos
        Contacto[] listadoContactos = new Contacto[50];
        //Lector de consola
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        int posicion = 0;
        do {
            //Metemos las opciones de menu
            do {
                System.out.println("1. Crear contacto");
                System.out.println("2. Imprimir lista contactos");
                System.out.println("3. Salir");
                System.out.println("Indique la opcion");
                opcion = lector.nextInt();
                lector.nextLine();
            } while (opcion < 1 || opcion > 3);
            switch (opcion) {
                case 1: {
                    if (posicion < 50) {
                        System.out.println("Indique nombre");
                        String nombre = lector.nextLine();
                        System.out.println("Indique telefono");
                        String telefono = lector.nextLine();
                        System.out.println("Indique correo");
                        String mail = lector.nextLine();
                        //Creo el objeto contacto
                        Contacto contacto = new Contacto(nombre, telefono, mail);
                        //Añado el contacto al array y aumento la posicion de escritura del array
                        listadoContactos[posicion] = contacto;
                        posicion++;
                    } else {
                        System.out.println("Lista de contactos llena, a pagar");
                    }
                    break;
                }
                case 2: {
                    if (posicion > 0) {
                        for (int i = 0; i < posicion; i++) {
                            System.out.println(listadoContactos[i].toString());
                        }
                    } else {
                        System.out.println("No hay contactos en la lista");
                    }
                }
            }
        } while (opcion > 0 && opcion < 3);
    }

}
