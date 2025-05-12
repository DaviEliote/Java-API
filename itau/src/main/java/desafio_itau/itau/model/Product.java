package desafio_itau.itau.model;

public class Product {

    public long id;
    public String name;
    public double price;

    public Product(long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public Product(long id){
        this.id = id;
    }

    public long getId(){

        return this.id;
    }

    public String getName(){

        return this.name;
    }

    public double getPrice(){

        return this.price;

    }


}
