package ru.itpark.service;

import ru.itpark.domain.Product;
import ru.itpark.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public List<Product> getSorted(Comparator<Product> comparator) {
        List<Product> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public List<Product> findAllByName(String name) {

        List<Product> result = new ArrayList<>();
        for (Product product : repository.getAll()) {
            String productName = product.getName();
            if (productName.contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> findAllByCategory(String category) {
        List<Product> result = new ArrayList<>();
        for (Product product : repository.getAll()) {
            String productCategory = product.getCategory();

            if (productCategory.equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }
}
