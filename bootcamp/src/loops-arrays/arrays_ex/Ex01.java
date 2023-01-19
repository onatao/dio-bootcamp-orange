

public class Ex01 {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6};
        
        int counter = 0; // counter irá assumir a posição no array
       
        /* while(counter < (number.length)) {
            System.out.println(number[counter]);
            counter++;
        } */

        for (int i = (number.length-1); i >= 0; i--) {
            System.out.println(number[i]);
        }
    }
}
