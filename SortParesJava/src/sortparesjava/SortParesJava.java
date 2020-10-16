/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortparesjava;

/**
 *
 * @author jeiso
 */
public class SortParesJava {

    public void sort(int arr[][]) {

        int mayor = -1;
        int mayotAnt = 0;
        int mayorI = 0;
        int indiceI = 0;

        int j = 0;
        while (j != arr.length - 1) {
            mayor = -1;
            for (int i = indiceI; i < arr.length; i++) {
                if (arr[i][1] > mayor) {
                    mayor = arr[i][1];
                    mayorI = i;
                    mayotAnt = i;
                }
                if (arr[i][1] == mayor) {
                    mayorI = mayotAnt;
                }

            }
            indiceI++;
            swap(arr, mayorI, j);
            j++;

        }

    }

    private void swap(int arr[][], int i, int j) {
        int anterior[] = arr[i];
        int nuevo[] = arr[j];
        arr[i] = nuevo;
        arr[j] = anterior;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
