package br.com.dev.util;

import br.com.dev.entities.Product;

import java.util.function.Function;

/*Function<T, R>
* R = é a entrada
* T = é o tipo da saida, ou seja do retorno */
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
