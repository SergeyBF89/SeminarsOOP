package org.Seminar1.classTask1.model;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
//
//import java.util.ArrayList;
//
//public class VendingMachine implements ProductMachine{
//
//    private ArrayList<Product> list;
//
//    public VendingMachine() {
//        list = new ArrayList<>();
//    }
//
//    public void addProduct(Product newItem) {
//        list.add(newItem);
//    }
//
//    public ArrayList getProductByName(String searchName) {
//        ArrayList<Product> result = new ArrayList<>();
//        for (Product item : list) {
//            if (item.getName().contains(searchName)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//    public ArrayList getProductByPrice (Double searchPrice) {
//        ArrayList<Product> result = new ArrayList<>();
//        for (Product item : list) {
//            if (item.getPrice().equals(searchPrice)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//}
