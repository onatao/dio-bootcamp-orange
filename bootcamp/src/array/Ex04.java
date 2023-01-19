package array;
    import java.util.Random;
public class Ex04 {
    public static void main(String[] args) {
        Random random_number = new Random();
         int[][] matriz = new int[4][4];

         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j > matriz[i].length; j++) {
                matriz[i][j] = random_number.nextInt(9);
            }
         }

         for (int[] linha: matriz) {
            for (int coluna: linha) {
                System.out.println(coluna + " ");
            }
            System.out.println();
         }

    }
}
