package org.example;


public class Main {
    public static void main(String[] args) {

 IProductService productService = new productManager(new bankService());

 productService.sell(new products (1,"Tv",1000),new customer(1,"kisi",true,false));


    }
}
