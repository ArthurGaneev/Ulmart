package ru.itpark;

import ru.itpark.comparator.NameAscComparator;
import ru.itpark.comparator.PriceAscComparator;
import ru.itpark.domain.Computer;
import ru.itpark.domain.Smartphone;
import ru.itpark.domain.TShirt;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService(new ProductRepository());
        service.add(new Smartphone(1, "Smartphone", "iPhone 8", 45_000, "...", "Apple", "Silver"));
        service.add(new Smartphone(2, "Smartphone", "iPhone X", 60_000, "...", "Apple", "Gold"));
        service.add(new Smartphone(3, "Smartphone", "Meizu", 60_000, "...", "Apple", "Gold"));
        service.add(new Computer(4, "Computer", "Samsung", 40_000, "...", "Korea", "Black"));
        service.add(new Computer(5, "Computer", "Asus", 50_000, "...", "Taiwan", "White"));
        service.add(new TShirt(6, "TShirt", "Adidas", 2_400, "...", "Male", 50));
        service.add(new TShirt(7, "TShirt", "Nikes", 2_400, "...", "Male", 50));

        System.out.println(new NameAscComparator());
        System.out.println(new PriceAscComparator());


        System.out.println(service.findAllByName("iPhone 8").getSorted(new NameAscComparator()));
        System.out.println(service.findAllByCategory("Samsung").getSorted(new NameAscComparator()));


    }
}
