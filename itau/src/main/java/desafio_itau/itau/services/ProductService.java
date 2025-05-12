package desafio_itau.itau.services;

import desafio_itau.itau.dto.NamePriceDTO;
import desafio_itau.itau.dto.ProductDTO;
import desafio_itau.itau.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductService {


    public static ArrayList<Product> products = new ArrayList<>();





    public static void addProduct(Product product){


        products.add(product);

    }

    public static void deleteAllProducts(){

        products.clear();
    }

    public ArrayList<Product> getAllProducts(){



        return products;

    }

    public static void updateProduct(Product product){
        int index;
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);

            if (p.getId() == product.getId()){
                products.set(i, product);
            }

        }

    }

    public static Optional<Product> getById(Product product) {

        for (Product p : products) {
            if (p.getId() == product.getId()) {
                return Optional.of(p);
            } else {
                return Optional.empty();
            }}
        return Optional.empty();
    }

    public ArrayList<NamePriceDTO> getNamePrice(){

        ArrayList<NamePriceDTO> dtolist = new ArrayList<>();

        for (Product p: products){

                dtolist.add(new NamePriceDTO(p.getName(), p.getPrice()));

        }
            return dtolist;
    }

}
