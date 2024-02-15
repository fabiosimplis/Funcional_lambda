package br.com.dev.application;

import br.com.dev.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("LapTop", 1200.00));
        list.add(new Product("Tablet", 500.00));

        Collections.sort(list);

        for (Product p: list) {
            System.out.println(p);
        }
    }
}