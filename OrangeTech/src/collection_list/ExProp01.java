package collection_list;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

public class ExProp01 {
    public static void main(String[] args) {
        List <String> month = new ArrayList<>();
        month.add("Janeiro");
        month.add("Fevereiro");
        month.add("Março");
        month.add("Abril");
        month.add("Maio");
        month.add("Junho");

        List<Double> tempList = new ArrayList<>(6);
        Scanner input = new Scanner(System.in);
       
        Double temp, avg;
        Double total = 0d;
        int counter = 0;
        
        
        do {
            System.out.println("Informe, respectivamente as temperaturas dos 6 primeiros meses do ano :");
            temp = input.nextDouble();
            tempList.add(temp);
            total += temp;
            counter++;
        }while(counter < 6);

        avg = (total/tempList.size());
        System.out.println("A média das temperaturas foi: " + avg);

        System.out.println("As temperaturas acima da média foram: ");
        for (Double value: tempList) {
            if (value > avg) System.out.print(value + " , ");
        }
       
        
        
        
        
        
        
        


    }
}
