package FichaPratica06;

public class Ex05 {

    static int maior(int[]array){
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    static int menor(int[]array){
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
    static boolean crescente (int[]array){
        boolean crescente = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                crescente = false;
            }
        }

        return crescente;
    }


}
