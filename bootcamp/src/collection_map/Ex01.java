package collection_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("GOL", 14.4d);
        carrosPopulares.put("UNO", 15.6d);
        carrosPopulares.put("MOBI", 16.1d);
        carrosPopulares.put("HB20", 14.5d);
        carrosPopulares.put("KWID", 15.6d);

        // Altere o consumo do GOL para 15.2
        carrosPopulares.put("GOL", 15.2d);
        System.out.println(carrosPopulares);

        // Confira se existe o modelo Tucson
        System.out.println("Existe o modelo Tucson? " + carrosPopulares.containsKey("TUCSON"));

        // Exiba o consumo do Uno
        System.out.println("Consumo: " + carrosPopulares.get("UNO"));

        // Exiba os modelos
        Set<String> modelos = carrosPopulares.keySet(); // .keySet() retorna um SET
        System.out.println(modelos);

        // Exiba os consumos 
        Collection<Double> consumo = carrosPopulares.values(); // .values() retorna uma COLLECTION
        System.out.println(consumo);

        // Exibir os modelos mais econômicos e seu consumo
        Double melhorConsumo = Collections.max(carrosPopulares.values()); // retorna o valor mais alto 
        
        Set<Map.Entry<String, Double>> entry = carrosPopulares.entrySet();
        String modelo = "";

        for (Map.Entry<String, Double> obj: entry) {
            if (obj.getValue().equals(melhorConsumo)) modelo = obj.getKey(); 
        }
        System.out.println("Modelo mais eficiente: " + modelo);
        System.out.println("Consumo: " + melhorConsumo);

        // Exiba o modelo menos econômico e seu consumo
        Double menosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenos = "";

        for (Map.Entry<String, Double> obj: entry) {
            if (obj.getValue().equals(menosEficiente)) {
                modeloMenos = obj.getKey();
                System.out.println(menosEficiente);
                System.out.println(modeloMenos);
            }
        }

        // Exiba a soma dos consumos
        Iterator<Double> valor = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (valor.hasNext()) {
            soma =+ valor.next();
        }
        System.out.println("A soma dos consumos é de: " + soma);

        // Exibir a média de consumo
        System.out.println(soma/carrosPopulares.size());

        // Remova modelo que possuem consumo igual a 15,6
        Iterator<Double> remover = carrosPopulares.values().iterator();
        
        while (remover.hasNext()) {
            if (remover.next().equals(15.6d)) remover.remove();;            
        }
        System.out.println(carrosPopulares);

        
        
        






    }
    
}
