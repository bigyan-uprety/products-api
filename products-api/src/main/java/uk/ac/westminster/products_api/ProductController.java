package uk.ac.westminster.products_api;

import org.springdoc.webmvc.ui.SwaggerIndexTransformer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {



    private final SwaggerIndexTransformer indexPageTransformer;

    public ProductController(SwaggerIndexTransformer indexPageTransformer) {
        this.indexPageTransformer = indexPageTransformer;
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);
    }

    @GetMapping("/all")
    public Map<String, Object> all() {
        List<Product> productList = new ArrayList<>();

        int id = 123;

        for (int index = 0; index <= 4; index++) {
            id += index;

            productList.add(new Product(
                    (long) id,
                    "Product-" + id,
                    199.99
            ));
        }

        return Map.of(
                "Total Products", productList.size(),
                "Products", productList
        );
    }
}










