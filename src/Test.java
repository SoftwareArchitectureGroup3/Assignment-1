/*
    Assignment-1
*/

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
/*
    -The factory class is responsible for creating all the objects and the client i.e the test class is independent.
    -If we want to add more products we don't have to make any changes to the test class or the client
    -Rather the abstract GroceryProductFactory and Factory will take care of the changes
*/

public class Test {
    public static void main(String[] args) {
        //2 inventories to keep track of the products added and removed
        ArrayList<Object> inventory=new ArrayList<>();//Customer inventory
        ArrayList<Object> storeInventory=new ArrayList<>();//Grocery store inventory

        Factory products=new Factory();
        //First create products
        // The main products are : Apples and Bananas
        //Apple has two variants : Apple1 and Apple 2
        //Banana has two variants: Banana1 and Banana 2
        Apple p1=products.createApple("1");
        Apple p2=products.createApple("2");
        Banana p3=products.createBanana("1");
        Banana p4=products.createBanana("2");

        //Add different products to the store inventory
        storeInventory.add(p1);
        storeInventory.add(p2);
        storeInventory.add(p3);
        storeInventory.add(p4);

        Scanner scan=new Scanner(System.in);
        System.out.println("Store inventory before purchase");
        System.out.println(storeInventory);
        System.out.println("Welcome to the GPF");
        //Take input from the customer in order to remove the product from the store inventory
        System.out.println("Please enter what type of apples you would like to buy (enter 1 or 2) ");
        String input=scan.next();
        if (input.equals("1")){
            storeInventory.remove(p1);
        }
        else {
            storeInventory.remove(p2);
        }

        System.out.println("Please enter what type of bananas you would like to buy (enter 1 or 2) ");
        String input2=scan.next();
        if (input.equals("1")){
            storeInventory.remove(p3);
        }
        else {
            storeInventory.remove(p4);
        }

        //Depending on the type of variant add the product to the customer inventory
        //The factory is responsible for creating products
        Factory product1= new Factory();
        Apple a1=product1.createApple(input);
        Banana b1=product1.createBanana(input2);

        inventory.add(a1);
        inventory.add(b1);

        System.out.println("Customer Inventory : ");
        System.out.println(inventory);

        System.out.println("Store inventory after purchase: ");
        System.out.println(storeInventory);

        System.out.println("Cost of each item:");
        a1.setApplePrice();
        b1.setBananaPrice();






    }
}
