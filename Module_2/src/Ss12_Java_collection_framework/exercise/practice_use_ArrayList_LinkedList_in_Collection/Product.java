package Ss12_Java_collection_framework.exercise.practice_use_ArrayList_LinkedList_in_Collection;

import Ss12_Java_collection_framework.practice.sort_with_Compable_and_Comparator.Student;

public class Product implements Comparable<Product> {
    private static int nextId = 0;
    private int id;
    private String nameProduct;
    private long price;
    private String origin;


    public Product(String nameProduct, long price, String origin) {
        this.id = Product.nextId;
        Product.nextId++;
        this.nameProduct = nameProduct;
        this.price = price;
        this.origin = origin;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID= " + this.id +
                ", nameProduct= '" + nameProduct + '\'' +
                ", price= " + price +
                ", origin= '" + origin + '\'' +
                '}';
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int compareTo(Product product) {
        return this.getNameProduct().compareTo(product.getNameProduct());
    }
}
