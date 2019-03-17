package com.gauravkhairnar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Enter the number of students: ");
        int s = scanner.nextInt();
        for (int i = 0;i<s;i++){
            System.out.println("Enter the name:");
            String temp = scanner.next();                  //if we use nextLine we cannot scan first element ,idk why
            //linkedList.add(temp);
            addInOrder(linkedList,temp);

        }
   //     linkedList.add("This will add automatically at last!!");
  //      linkedList.add(2,"this will add at index 2"); //and will push down others
        System.out.println("\nThe list is:");
        printList(linkedList);


    }
    public static void printList(LinkedList<String > temp){
        Iterator<String> myIterator = temp.iterator();
        while (myIterator.hasNext()){                   //has nxt returns bool
            System.out.println((myIterator.next()));    //iterator.next() is same as index++
        }

    }
    public static void addInOrder(LinkedList<String> linkedList,String NeW){

        ListIterator<String> myListIterator = linkedList.listIterator();

        while (myListIterator.hasNext()){
            int comparison = myListIterator.next().compareTo(NeW);
            if(comparison == 0){
                //Same elemet already exists so do not add !
                System.out.println("Name alredy exists!!");
                break;

            }else if (comparison > 0){
                //new name sould appear before this !
                myListIterator.previous();
                myListIterator.add(NeW);                //new element is added at current location of listiterator
                break;

            }else if(comparison < 0){
                //move to next name;
               // break;

            }
        }
        myListIterator.add(NeW);
        return;
    }

}
