package desafio_itau.itau.dto;

import desafio_itau.itau.model.Product;
import jakarta.validation.constraints.NotNull;

public class ProductDTO {

    @NotNull
    private long id;
    @NotNull
    private String name;
    @NotNull
    private double price;

    public ProductDTO(){}

    public ProductDTO(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();

    }

    public ProductDTO(long id){
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
