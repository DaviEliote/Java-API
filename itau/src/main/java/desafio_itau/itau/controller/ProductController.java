package desafio_itau.itau.controller;
import desafio_itau.itau.dto.ProductDTO;
import desafio_itau.itau.model.Product;
import desafio_itau.itau.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    //get all products in memory
    @GetMapping("/getAllProducts")
    public ArrayList<Product> get(){

        return productService.getAllProducts();

    }

    //get all products by id
    @GetMapping("/getProductById")
    public Optional<Product> getById(@RequestBody ProductDTO request){

            try {
                return ProductService.getById(new Product(request.getId()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

    }

    //Update a product in memory
    @PutMapping("/updateProduct")
    public ArrayList<Product> update(@RequestBody ProductDTO request){

        try{
            ProductService.updateProduct(new Product(request.getId(), request.getName(), request.getPrice()));
            return ProductService.products;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


   }



    //add a new product in memory
    @PostMapping("/postProduct")
    public ResponseEntity<Void> post(@RequestBody ProductDTO request){

        try{
        ProductService.addProduct(new Product(request.getId(), request.getName(), request.getPrice()));
        return ResponseEntity.status(HttpStatus.CREATED).build();} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //delete all products in memory
    @DeleteMapping("/deleteAllProducts")
    public ResponseEntity<Void> delete(){

            productService.deleteAllProducts();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}