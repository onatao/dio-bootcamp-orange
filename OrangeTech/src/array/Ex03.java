package array;
    import java.util.Random;
public class Ex03 {
    public static void main(String[] args) {
        Random n = new Random();
         int[] numberList = new int[20];

        for (int i = 0; i < numberList.length; i++) {
            int value = n.nextInt(100);
            numberList[i] = value;
        }

        for (int number: numberList) {
            System.out.println(number + " SUCESSOR: " + (number + 1));
        }
    }

    
    
}
