package ru.itpark;

import ru.itpark.comparator.NameAscComparator;
import ru.itpark.comparator.PriceAscComparator;
import ru.itpark.domain.Computer;
import ru.itpark.domain.Product;
import ru.itpark.domain.Smartphone;
import ru.itpark.domain.TShirt;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Добавление (один метод для добавления любого товара)
        ProductService service = new ProductService(new ProductRepository());
        service.add(new Smartphone(1, "Smartphone", "iPhone 8", 45_000, "...", "Apple", "Silver"));
        service.add(new Smartphone(2, "Smartphone", "iPhone X", 60_000, "...", "Apple", "Gold"));
        service.add(new Smartphone(3, "Smartphone", "Meizu", 60_000, "...", "Meizu", "Сherry"));
        service.add(new Computer(4, "Computer", "Samsung", 40_000, "...", "Korea", "Black"));
        service.add(new Computer(5, "Computer", "Asus", 50_000, "...", "Taiwan", "White"));
        service.add(new TShirt(6, "TShirt", "Adidas", 2_400, "...", "Male", 50));
        service.add(new TShirt(7, "TShirt", "Nikes", 2_400, "...", "Male", 50));



        //Поиск по названию – возвращается список всех найденных (из всех категорий,
        //отсортированный по названию)
        System.out.println("Поиск по названию: "+service.findAllByName("Samsung"));
        //Просмотр по категории – возвращается список товаров из категории (отсортированный по
        //названию)
        List<Product> shirt = service.findAllByCategory("TShirt");
        System.out.println("Поиск по категории: "+shirt);


        //Сортировка товаров (по возрастанию цены)
        System.out.println("Сортировка по возрастанию цены: "+service.getSorted(new PriceAscComparator()));




    }
}
