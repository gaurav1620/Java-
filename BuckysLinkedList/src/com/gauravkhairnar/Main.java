package com.gauravkhairnar;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        String[] things1 = {"apple","Bananas","Kiwi","Mango"};
        //First linked list
        List<String> LList1 = new LinkedList<>();
        for(String var:things1){
            LList1.add(var);
        }

        String[] things2 = {"Pomogranate","Grapes","Orange","Strawberries"};
        //Second LinkedList
        List<String> LList2 = new LinkedList<>();
        for(String var:things2){
            LList2.add(var);
        }

        //LList.addAll adds all the elments in LList2 to LList1
        LList1.addAll(LList2);

        //Freeing some sapce:)
        LList2 = null;

        System.out.println("Original List:");
        printMe(LList1);

        System.out.println("Test");
        removeInAnInterval(LList1,3,5);
        System.out.println("List after removing an interval:");
        printMe(LList1);

        System.out.println("Printing reverse list:");
        printMyReverse(LList1);
    }

    private static void printMe(List<String> l){
        for(String x: l){
            System.out.println("-"+x);
        }
    }
    private static void removeInAnInterval(List<String> l,int from,int to){
        l.subList(from,to).clear();  //clear is used to remove a collection of elements from a list
    }
    private static void printMyReverse(List<String> l){
        ListIterator<String> myListIterator = l.listIterator(l.size());
        while (myListIterator.hasPrevious()){
            System.out.println(myListIterator.previous());
        }
    }
}
