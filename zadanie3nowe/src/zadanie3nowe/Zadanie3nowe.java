
package zadanie3nowe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Zadanie3nowe {


    public static void main(String[] args) {
        List<Product> produkty = new ArrayList<>();
        Set<String> kategorie = new HashSet<>();
        Map<Integer, Product> Map1 = new HashMap<>();
        Map<String, List<Product>> Map2 = new HashMap<>();
        
        try (BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

            String s = in.readLine();

            while (s != null) {
                String[] pola = s.split(";");
                Product prod = new Product(Integer.parseInt(pola[0]), pola[1], pola[2], Double.parseDouble(pola[3]));
                produkty.add(prod);
                Map1.put(Integer.parseInt(pola[0]), prod);
                Map2.put(pola[2], produkty);
                kategorie.add(pola[2]);
                s = in.readLine();
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        for (String kat : kategorie) {
            List<Product> kategoria = new ArrayList<>();
            for (Product prod : produkty) {
                if (kat.equals(prod.getCategory())) {
                    kategoria.add(prod);
                }
            }
            Map2.put(kat, kategoria);
        }
        
        for(Integer id : Map1.keySet()) {
            Product prod = Map1.get(id);
            System.out.println(prod);
        }
        
        System.out.println();
        
        for(String kat : Map2.keySet()) {
            List<Product> listaproduktow = Map2.get(kat);
            System.out.println(kat + " : " + listaproduktow);
        }
    }
    
}
