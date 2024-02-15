package br.com.dev.application;

import br.com.dev.entities.Product;
import br.com.dev.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class ConsumerProgram {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Fazer programa qua aumente o valor do produto em 10%

        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}
