package FinalTasks.InventoryService;

import FinalTasks.InventoryService.exception.OutOfStockException;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class InventoryService {
    private Map<String, List<Product>> inventory;
    private boolean isInventoryOpen;

    public InventoryService() {
        this.inventory = new HashMap<>();
        this.isInventoryOpen = true;
    }


    public void setIsInventoryOpen() {
        isInventoryOpen = true;
    }

    public void setInventoryClose() {
        isInventoryOpen = false;

    }
    //add product if isInventoryOpen==true
    public void addProduct(Product product) {
        if (isInventoryOpen) {
            String category = product.getCategory();
            if (!inventory.containsKey(category)) {
                inventory.put(product.getCategory(), new LinkedList<>());
            }
            inventory.get(category).add(product);
        } else {
            System.out.println("Inventory is closed");
        }
    }

    public List<Product> getProductsByCategory(String category) {
        List<Product> product = inventory.get(category);
        if (product == null || product.isEmpty()) {
            throw new OutOfStockException("Not such products in category " + category);
        }
        return product;
    }

    public List<Product> filterProductsByPrice(double minPrice, double maxPrice) {
        List<Product> filteredByPrice = inventory.values().stream()
                .flatMap(List::stream)
                .filter(product -> ((product.getPrice() < maxPrice) && (product.getPrice() > minPrice)))
                .collect(Collectors.toList());

        System.out.println(filteredByPrice);
                return filteredByPrice;
    }

    @Override
    public String toString() {
        return "InventoryService{" +
                "inventory=" + inventory +
                ", isInventoryOpen=" + isInventoryOpen +

                '}';
    }

    public static void main(String[] args) {
        Product product1 = new Product("Milk", 2.5, "Grocery")  ;
        Product product2 = new Product("Bread", 1, "Grocery")  ;
        Product product3 = new Product("Gasoline", 3.5, "Gazoline")  ;

        InventoryService service = new InventoryService();
        service.setIsInventoryOpen();
        service.addProduct(product1);
        service.addProduct(product2);
        service.addProduct(product3);
        System.out.println(service);
        List<Product>filtered = service.filterProductsByPrice(1,3);
        System.out.println();
        filtered.forEach(System.out::println);
        System.out.println();

        List<Product> byCategory = service.getProductsByCategory("Grocery");
        System.out.println(byCategory);
        List<Product> byCategoryException = service.getProductsByCategory("k");


        service.setInventoryClose();
        service.addProduct(new Product("B", 22, "G"));

    }

}
