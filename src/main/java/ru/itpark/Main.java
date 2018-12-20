package ru.itpark;

import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService(new ProductRepository());


    }
}
