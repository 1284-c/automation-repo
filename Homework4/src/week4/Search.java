package week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public void SearchPage() {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Apple","Fruit","1KG",5,3));
        product.add(new Product("Pear","Fruit","1 Unit",5,3));
        product.add(new Product("Grape","Fruit","1KG",8,3));
        product.add(new Product("Tomatto","Vegetable","1KG",5,3));
        product.add(new Product("Pepper","Vegetable","500g",5,3));
        product.add(new Product("Lays","Chips","1KG",5,3));
        product.add(new Product("Doritos","Vegetable","1KG",5,3));
        product.add(new Product("Ruffles","Vegetable","1KG",5,3));
        product.add(new Product("Tadelle","Chocalate","1KG",5,3));
        product.add(new Product("Albeni","Chocalate","1KG",5,3));
        product.add(new Product("Metro","Chocalate","1KG",5,3));

        System.out.println("Search in APP");
        Scanner scan = new Scanner(System.in);
        int searchproduct = scan.nextInt();
        for (Product productt : product) {
            if (productt.getName().equals(searchproduct)) {
                System.out.println(product);
            }
            else{
                System.out.println("Prdouct cannot found");

            }

    }
}
}
