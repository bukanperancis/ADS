import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

// Julia Ameera Binti Mohd Hasran, COE, 22006806

public class Bag {
    int count;
    int max;
    ArrayList<String> itemList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public boolean add(int thing){
        System.out.print("\nEnter the name of your item: ");
        String itemName = scanner.nextLine();
        itemList.add(itemName);
        System.out.println(itemName +" has been added to bag!");
        return true;
    }

    /*public boolean remove (int thing){
        System.out.println("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();

        for (String element : itemList){
            if (itemToRemove == element){
                System.out.println("Match is found");
                itemList.remove(element);
            }
        }
         return true;
    }

    public boolean find(int thing){

        System.out.println("Enter item to find: ");
        String itemToFind = scanner.nextLine();

        for (String element : itemList){
            if (itemToFind == element){
                System.out.println(element);
                System.out.println("Item is in your backpack");
            }

            else{
                System.out.println("Item is not in your backpack.");
            }
        }
        return true;
    }
     */


    public int count(){
        return itemList.size();
    }

    public ArrayList getAll(){
        System.out.println("\nItems in your backpack are: ");
        for (String i : itemList) {
            System.out.print(i + ", ");
        }
        return itemList;
    }
    public boolean removeAll(){
        System.out.println("\nBackpack before clearing: " + itemList);

        itemList.clear();
        System.out.println("Backpack after clearing: " + itemList);

        System.out.println("Your backpack is now empty!");
        return true;
    }

    public boolean isFull(){
        if (itemList.size()==20){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (itemList.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Bag bag = new Bag();
        int option;
        char addOther;
        ArrayList<String> itemsList = new ArrayList<>();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n     --- VIRTUAL BACKPACK ---");
            System.out.println("(1) Add Item\t    (2) Remove Item");
            System.out.println("(3) Find Item\t    (4) Count Items");
            System.out.println("(5) Get All Items\t(6) Remove All Items");
            System.out.println("(7) Exit Virtual Backpack");

            System.out.println("Option 2 and 3 are currently unavailable. We're verry sorry >,<");
            System.out.print("Choose an option (number): ");
            option = scanner.nextInt();

            if (option == 1){ // adding item into bagpack
                int count = 1;
                do{
                    boolean itemAdded = bag.add(count);

                    System.out.print("\n>> Enter Y to add another item or N to stop: ");
                    addOther = scanner.next().charAt(0);

                } while (addOther == 'Y' || addOther == 'y' );
            }

            /*else if (option == 2){ // removing an item from bag
                boolean itemRemoved = bag.remove(0); // just a dummy number to act as parameter
            }

            else if (option == 3){ // finding an item in bag
                boolean findItem = bag.find(0); // just a dummy number to act as parameter
            }
             */

            else if (option == 4){ // total number of items in bagpack
                int totalItems = bag.count();
                if (totalItems == 0){
                    System.out.println("Bagpack is empty. Total Item: 0");
                }
                else {
                    System.out.println("Total Item: " +totalItems);
                }
            }

            else if (option == 5){ // to empty backpack
                bag.getAll();
            }

            else if (option == 6){
                boolean emptyBag = bag.removeAll();
            }

        } while (option != 7);

    }
}

