package cine;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cine {

    public static void main(String[] args) {
        System.out.println("Sistema de reservas - Cine");
        System.out.println();

        int[][] sala = new int[5][8];
        int filas = sala.length;
        int columnas = sala[0].length;
        String[] encabezadoFilas = {"A", "B", "C", "D", "E"};

        mostrarMatriz(sala, filas, columnas, encabezadoFilas);
        System.out.println();
        System.out.println("Luego de vender algunas entradas:");

        int asientosOcupados = ThreadLocalRandom.current().nextInt(10, 16);
        int[][] salaOcupada = ocuparAsientosAleatorios(asientosOcupados, sala, filas, columnas);

        mostrarMatriz(salaOcupada, filas, columnas, encabezadoFilas);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el numero de asientos juntos que deseas: ");

        if (!sc.hasNextInt()) {
            System.out.println("Entrada invalida. Debes ingresar un numero.");
            sc.close();
            return;
        }

        int numeroAsientos = sc.nextInt();
        sc.close();

        if (numeroAsientos <= columnas && numeroAsientos >= 1) {
            int[] posicion = buscarAsientosLibresConsecutivos(numeroAsientos, salaOcupada, filas, columnas);
            int fila = posicion[0];
            int columna = posicion[1];

            if (fila == -1) {
                System.out.println("No se encontraron " + numeroAsientos + " asientos juntos disponibles.");
                return;
            }

            if (numeroAsientos == 1) {
                System.out.println("Tienes " + numeroAsientos + " asiento libre en la posicion: "
                        + encabezadoFilas[fila] + (columna + 1) + ".");
            } else {
                System.out.println("Tienes " + numeroAsientos + " asientos libres desde la posicion: "
                        + encabezadoFilas[fila] + (columna + 1)
                        + " hasta " + encabezadoFilas[fila] + (columna + numeroAsientos) + ".");
            }

            int[] libresPorZona = contarPorZona(salaOcupada, filas, columnas);
            int libresVip = libresPorZona[0];
            int libresNormal = libresPorZona[1];

            System.out.println("En la zona VIP hay: " + libresVip + " asientos libres en total.");
            System.out.println("En la zona normal hay: " + libresNormal + " asientos libres en total.");
            System.out.println();

            calcularOcupacion(asientosOcupados, filas, columnas);
        } else {
            System.out.println("La fila solo tiene " + columnas + " asientos.");
        }
    }

    public static void mostrarMatriz(int[][] matriz, int filas, int columnas, String[] codigoFilas) {
        System.out.println("     PANTALLA");
        System.out.println("------------------");
        System.out.print("   ");
        for (int k = 1; k <= columnas; k++) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            System.out.print(codigoFilas[i] + "  ");
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("L ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }

        System.out.println("(L=Libre, O=Ocupado)");
    }

    public static int[][] ocuparAsientosAleatorios(int cantidad, int[][] cine, int filas, int columnas) {
        for (int i = 0; i < cantidad; i++) {
            int f = ThreadLocalRandom.current().nextInt(0, filas);
            int c = ThreadLocalRandom.current().nextInt(0, columnas);

            if (cine[f][c] != 1) {
                cine[f][c] = 1;
            } else {
                i--;
            }
        }

        return cine;
    }

    public static int[] buscarAsientosLibresConsecutivos(int cantidad, int[][] matriz, int filas, int columnas) {
        int asientosLibres = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != 0) {
                    asientosLibres = 0;
                    continue;
                }

                asientosLibres++;
                if (asientosLibres == cantidad) {
                    return new int[]{i, j - cantidad + 1};
                }
            }
            asientosLibres = 0;
        }

        return new int[]{-1, -1};
    }

    public static int[] contarPorZona(int[][] matriz, int filas, int columnas) {
        int asientosLibresVip = 0;
        int asientosLibresNormal = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != 0) {
                    continue;
                }

                if (i > 1) {
                    asientosLibresNormal++;
                } else {
                    asientosLibresVip++;
                }
            }
        }

        return new int[]{asientosLibresVip, asientosLibresNormal};
    }

    public static void calcularOcupacion(int cantidad, int filas, int columnas) {
        int ocupacion = cantidad * 100 / (filas * columnas);
        System.out.println("El porcentaje de asientos ocupados es: " + ocupacion + " %.");
    }
}
