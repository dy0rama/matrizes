import java.util.Scanner;

public class MatrizExercicio {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print("Digite o valor da linha " + i + " coluna " + j + ": ");
                numeros[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
