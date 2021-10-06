package one.digitalinnovation.experts.productscatalog.controller;

import one.digitalinnovation.experts.productscatalog.model.Product;
import one.digitalinnovation.experts.productscatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "{id}")
    public Optional<Product> findById(@PathVariable("id")Integer id){
        return productRepository.findById(id);
    }



}
