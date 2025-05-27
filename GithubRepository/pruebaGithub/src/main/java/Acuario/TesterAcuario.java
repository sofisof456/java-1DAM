package Acuario;

import java.util.Scanner;

public class TesterAcuario {
    public static void gestionMenu() {
        Scanner sc = new Scanner(System.in);
        Acuario acuarioclase = new Acuario();
        int opc = 0;

        do {
            System.out.println();
            System.out.println("****************");
            System.out.println("Menú de opciones");
            System.out.println("666. Mostrar ¿¿(o_O)??");
            System.out.println("6661. Mostrar con cosas");
            System.out.println("1. Listar animales");
            System.out.println("2. Dar de alta");
            System.out.println("3. Dar de baja");
            System.out.println("4. Mostrar animales alta/baja");
            System.out.println("0. Salir");

            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 666:
                    acuarioclase.generarAnimalesAleatorios();
                    acuarioclase.mostrarAnimales();
                    break;
                case 6661:
                    acuarioclase.generarAnimalesAleatorios2();
                    acuarioclase.mostrarAnimales2();
                    break;
                case 1:
                    acuarioclase.generarListadoAnimales();
                    acuarioclase.listarAnimales();
                    break;
                case 2:
                    acuarioclase.darAlta();
                    break;
                case 3:
                    acuarioclase.darBaja();
                    break;
                case 4:
                    acuarioclase.mostrar_altaBaja();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opc != 0);

    }

    public static void main(String[] args) {
        gestionMenu();
    }
}
