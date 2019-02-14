import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Collections;
import java.util.Scanner;

public class Book_dynamics {
    static Scanner scanner=new Scanner(System.in);

    public void Book(){
        String choice;
        System.out.println("|****WELLCOME TO**|");
        System.out.println("|SIMPLE BOOK STORE|");
        System.out.println("|*****************|");
        while (true){
            System.out.println("PRESS..");
            System.out.println("'1'-Add_Book");
            System.out.println("'2'-Remove_Book");
            System.out.println("'3'-Display_Book");
            System.out.println("'4'-Sort_Book");
            System.out.println("'5'-Search_Book");
            System.out.println("'6'-Exit");
            choice=scanner.nextLine();
            switch (choice){
                case "1":
                    addBook();
                    break;
                case "2":
                    removeBook();
                    break;
                case "3":
                    displayBook();
                    break;
                case "4":
                    sortBook();
                    break;
                case "5":
                    searchBook();
                    break;
                case "6":
                    exit();
                    break;
                    default:
                        System.out.println("please enter the correct choice");
            }
        }

    }
    public void addBook(){
        String choice;
        Double price;
      while(true){
          System.out.println("Please enter..");
                    System.out.println("BOOK TITLE: ");
                    choice=scanner.nextLine();
                    Book_App.titlee.add(choice);
                    System.out.println("BOOK AUTHOR: ");
                    choice=scanner.nextLine();
                    Book_App.authorr.add(choice);
                    System.out.println("BOOK DESCRIPTION: ");
                    choice=scanner.nextLine();
                    Book_App.descriptionn.add(choice);
                    System.out.println("PRICE:..");
                    price=scanner.nextDouble();
                    Book_App.pricee.add(price);
                    System.out.println("InStock?: type(Y|yes) or any other key for (NO)");
                    choice=scanner.nextLine();
                    if (choice.equalsIgnoreCase("y")||(choice.equalsIgnoreCase("yes"))){
                        Book_App.isInStockk.add(true);
                    }
                    else{
                        Book_App.isInStockk.add(false);
                    }
                    System.out.println("Successfully Saved");
                    Book();
      }
    }
    public void removeBook(){
        if(Book_App.titlee.size()<=0){
            System.out.println("No Book On the store");
        }
        else {
            String choice = "";
            System.out.println("please enter the book title..");
            choice = scanner.nextLine();
            if (Book_App.titlee.contains(choice)) {
                System.out.println(true);
                int number = Book_App.titlee.indexOf(choice);
                Book_App.titlee.remove(number);
                Book_App.authorr.remove(number);
                Book_App.descriptionn.remove(number);
                Book_App.pricee.remove(number);
                Book_App.isInStockk.remove(number);
                System.out.println("successfully deleted..");
            }
        }
    }
    public void displayBook(){
        if (Book_App.titlee.size()<=0){
            System.out.println("No Book On the store");
        }
        else{
            for(int counter=0;counter<Book_App.titlee.size();counter++){
                System.out.println("Title: "+Book_App.titlee.get(counter));
                System.out.println("Author: "+Book_App.authorr.get(counter));
                System.out.println("Description: "+Book_App.descriptionn.get(counter));
                System.out.println("Price: "+Book_App.pricee.get(counter));
                System.out.println("InStock: "+Book_App.isInStockk.get(counter));
            }
        }
    }
    public void sortBook(){
        //Collections.sort("dd");
        //Collections.sort(Book_App.titlee);
        //System.out.println(Book_App.titlee.indexOf());
        System.out.println("currently not supported");
    }
    public void searchBook(){
        String Choice;
        System.out.println("please type the title of the book.");
        Choice=scanner.nextLine();
        int index=Collections.binarySearch(Book_App.titlee,Choice);
        System.out.println(index);
        System.out.println("Search Result");
        System.out.println("Title: "+Book_App.titlee.get(index));
        System.out.println("Author: "+Book_App.authorr.get(index));
        System.out.println("Description: "+Book_App.descriptionn.get(index));
        System.out.println("Price: "+Book_App.pricee.get(index));
        System.out.println("InStock: "+Book_App.isInStockk.get(index));
    }
    public void exit(){
   System.exit(0);
    }
}
