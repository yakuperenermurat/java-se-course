package com.yakuperenermurat.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    public static void main(String[] args) {

        List <Product> productList = new ArrayList<Product>();


        productList.add(new Product(1,"Ekmek",6F));
        productList.add(new Product(2,"Süt",8.1F));
        productList.add(new Product(3,"Su",3.0F));
        productList.add(new Product(4,"Peynir",66.1F));
        productList.add(new Product(5,"Çikolata",18.1F));
        productList.add(new Product(6,"Domates",9.1F));


        List<Product> productList2 =
                productList
                        .stream()
                        .filter( p -> p.getPrice() > 5 )
                        .limit(3)
                        // .mapToDouble(Product::getPrice).sum() //1.yol
                        // .reduce(0 , ()) // 2.yol
                        //TODO toplam sonucu elde edin lütfen.
                        .collect(Collectors.toList());

        System.out.println(productList2);

    }

}
