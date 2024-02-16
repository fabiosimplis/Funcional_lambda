package br.com.dev.application;

import br.com.dev.entities.Product;
import br.com.dev.util.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductServiceProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
