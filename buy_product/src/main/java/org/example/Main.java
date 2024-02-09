package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 IProductService productService = new productManager(new bankService());

 productService.sell(new products (1,"Tv",1000),new customer(1,"kisi",true,false));

 //System.out.println();
    }
}