package com.gauravkhairnar;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobile {
    private static Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> myContacts = new ArrayList<Contacts>();
    /*
\ \      / /_ _ ___| |_ ___  __| |   __ _  | | ___ | |_    ___  / _|
 \ \ /\ / / _` / __| __/ _ \/ _` |  / _` | | |/ _ \| __|  / _ \| |_
  \ V  V / (_| \__ \ ||  __/ (_| | | (_| | | | (_) | |_  | (_) |  _|
   \_/\_/ \__,_|___/\__\___|\__,_|  \__,_| |_|\___/ \__|  \___/|_|

 _   _                                _   _     _
| |_(_)_ __ ___   ___    ___  _ __   | |_| |__ (_)___
| __| | '_ ` _ \ / _ \  / _ \| '_ \  | __| '_ \| / __|
| |_| | | | | | |  __/ | (_) | | | | | |_| | | | \__ \
 \__|_|_| |_| |_|\___|  \___/|_| |_|  \__|_| |_|_|___/

  __                  _   _
 / _|_   _ _ __   ___| |_(_) ___  _ __
| |_| | | | '_ \ / __| __| |/ _ \| '_ \
|  _| |_| | | | | (__| |_| | (_) | | | |
|_|  \__,_|_| |_|\___|\__|_|\___/|_| |_|                           _   _     _
     */                                                         //| |_| |__ (_)___
    public int  findContact(String Xname){                      //| __| '_ \| / __|
        for(int i = 0;i < myContacts.size();i++){               //| |_| | | | \__ \
            Contacts test = myContacts.get(i);                  // \__|_| |_|_|___/
            if(test.getName().equals(Xname)){                   //Be sure to use .equals functions
                return i;
            }
        }
        return -1;
    }
    public void addContact(){
        String n,no;
        System.out.println("**************************");
        System.out.println("Enter name:");
        n = scanner.nextLine();
        if(findContact(n) == -1){
            System.out.println("Enter number:");
            no = scanner.nextLine();
            Contacts a= new Contacts(n,no);
            myContacts.add(a);
        }else{
            System.out.println("Contact already in list. (if you want to edit it select choice 6)");
        }
        System.out.println("**************************");
    }
    public void delContact(){
        System.out.println("**************************");
        System.out.println("Enter the Name of contact to be deleted:");
        String name = scanner.nextLine();
        int d = findContact(name);
        if(d == -1){
            System.out.println("Contact not in the list!!");
        }else{
            System.out.println(myContacts.get(d).getName()+" --> "+myContacts.get(d).getNumber()+"Deleted Successfully");
            myContacts.remove(d);
        }
        System.out.println("**************************");

    }
    public void printContacts(){
        System.out.println("**************************");
        System.out.println("Conntact List: ");
        for(int i = 0;i<myContacts.size();i++){
            System.out.println(i+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getNumber());
        }
        System.out.println("**************************");
    }
    public void printAContact(int i){
        System.out.println(i+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getNumber());
    }
    public void searchByName(){
        System.out.println("**************************");
        System.out.println("Enter the Name of contact to be searched:");
        String name = scanner.nextLine();
        int d = findContact(name);
        if(d == -1){
            System.out.println("Contact not in the list!!");
        }else{
            System.out.println("Contact found");
            printAContact(d);
        }
        System.out.println("**************************");
    }
    public void updateContact(){
        System.out.println("**************************");
        System.out.println("Enter the name of contact to be replaced:");
        String y = scanner.nextLine();
        int x = findContact(y);
        if(x == -1){
            System.out.println("Contact not found!! :(");
        }else{
            System.out.println("Enter the new name:");
            String name = scanner.nextLine();
            System.out.println("Enter the new number:");
            String num = scanner.nextLine();

            myContacts.get(x).setName(name);
            myContacts.get(x).setNumber(num);
            System.out.println("Contact updated Successfully!!");
        }
        System.out.println("**************************");
    }
}

