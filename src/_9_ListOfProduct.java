import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.Writer;
 
public class _9_ListOfProduct {
 
        public static void main(String[] args) {
                ArrayList<Product> products = new ArrayList<Product>();
                BufferedReader reader;
                Writer writer = null;
                try {
                        reader = new BufferedReader(new FileReader("InputProduct.txt"));
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                           String[] splittedLine = line.split(" ");
                           products.add(new Product(splittedLine[0], Double.parseDouble(splittedLine[1])));
                        }
                        Collections.sort(products);
                       
                        writer = new BufferedWriter(new FileWriter("OutputProduct.txt"));
                        for(Product product : products){
                                writer.write(product.getPrice() + " " + product.getName() + "\r\n" );
                        }
                }
                catch (Exception e) {
                        System.out.println("Error");
                }
                finally {
                           try {writer.close();} catch (Exception ex) {}
                        }
 
        }
 
}