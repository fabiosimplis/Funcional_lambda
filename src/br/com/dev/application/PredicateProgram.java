package br.com.dev.application;

import br.com.dev.entities.Product;
import br.com.dev.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateProgram {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.00));

        //Remover todos que tenham preço acima de 100
        //list.removeIf(p -> p.getPrice() >= 100);
        //Utilizando a interface implemantada
        //list.removeIf(new ProductPredicate());
        //Referencia para método = Product::staticProductPredicate
        list.removeIf(Product::nonStaticProductPredicate);


        for(Product p: list){
            System.out.println(p);
        }
    }
}
