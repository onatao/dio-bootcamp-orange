
    import java.util.Random;
public class Ex03 {
   public static void main(String[] args) {
    Random number = new Random();
    
    int[] numberList = new int[20]; 
    for(int i = 0; i < numberList.length; i++) {
        int value = number.nextInt(100);
        numberList[i] = value;
    }

    for (int object : numberList) {
        System.out.println(object +  " SUCESSOR: " + (object += 1));
    }

   } 
}
