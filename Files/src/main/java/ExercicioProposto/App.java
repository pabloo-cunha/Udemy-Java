package ExercicioProposto;

import ExercicioProposto.entitie.Product;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String itemCsv = br.readLine();
            while (itemCsv!=null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                BigDecimal price = BigDecimal.valueOf(Double.parseDouble(fields[1]));
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));
                itemCsv = br.readLine();
                System.out.println("Produtos criados!");
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product item : list){
                    bw.write(item.getProduct()+ "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " Created");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e){

            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
