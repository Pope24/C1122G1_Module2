package Ss12_Java_collection_framework.exercise.practice_use_ArrayList_LinkedList_in_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static int chooseUser() {
        System.out.println("Menu: ");
        System.out.println("1 - Them san pham. ");
        System.out.println("2 - Sua thong tin san pham theo id. ");
        System.out.println("3 - Xoa san pham theo id. ");
        System.out.println("4 - Hien thi danh sach san pham. ");
        System.out.println("5 - Tim kiem thong tin san pham theo ten. ");
        System.out.println("6 - Sap xep san pham theo thu tu tang dan. ");
        System.out.println("7 - Sap xep san pham theo thu tu giam dan. ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Su lua chon cua ban la: ");
        int chosen = sc.nextInt();
        return chosen;
    }

    public static void addProduct(List productList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        String nameProduct = sc.nextLine();
        System.out.println("Nhap gia san pham: ");
        long price = sc.nextLong();
        System.out.println("Nhap nguon goc xuat xu: ");
        sc.nextLine();
        String origin = sc.nextLine();
        productList.add(new Product(nameProduct, price, origin));
    }

    public static void editProductById(List productList, int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        String nameProduct = sc.nextLine();
        System.out.println("Nhap gia san pham: ");
        long price = sc.nextLong();
        System.out.println("Nhap nguon goc xuat xu: ");
        sc.nextLine();
        String origin = sc.nextLine();
        productList.set(id, new Product(nameProduct, price, origin));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        PriceComparator priceComparator = new PriceComparator();
        int chosen;
        do {
            chosen = chooseUser();
            switch (chosen) {
                case 1:
                    addProduct(productList);
                    break;
                case 2:
                    System.out.println("Nhap id cua san pham ban muon chinh sua: ");
                    int idProductEdit = sc.nextInt();
                    if (idProductEdit <= productList.size()) {
                        editProductById(productList, idProductEdit);
                    } else {
                        System.out.println("Khong co san pham co id la " + idProductEdit);
                    }
                    break;
                case 3:
                    System.out.println("Nhap id san pham ma ban muon xoa: ");
                    int idProductRemove = sc.nextInt();
                    if (idProductRemove <= productList.size()) {
                        productList.remove(idProductRemove);
                    } else {
                        System.out.println("Khong co san pham co id la " + idProductRemove);
                    }
                    break;
                case 4:
                    System.out.println("Danh sach san pham la: ");
                    for (Product product : productList) {
                        System.out.println(product.toString());
                    }
                    break;
                case 5:
                    System.out.println("Nhap ten san pham ban muon tim kiem");
                    String nameProductSeach = sc.nextLine();
                    int count = 0;
                    for (Product product : productList) {
                        if (product.getNameProduct().equals(nameProductSeach)) {
                            System.out.println(product);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Khong co san pham nay trong danh sach tim kiem !!!");
                    }
                    break;
                case 6:
                    System.out.println("Danh sach san pham sau khi sap xep tang dan: ");
                    Collections.sort(productList, priceComparator);
                    for (Product product : productList) {
                        System.out.println(product.toString());
                    }
                    break;
                case 7:
                    Collections.sort(productList, priceComparator);
                    Collections.reverse(productList);
                    for (Product product : productList) {
                        System.out.println(product.toString());
                    }
                    break;
            }
        } while (chosen > 0 && chosen <= 7);
    }
}
