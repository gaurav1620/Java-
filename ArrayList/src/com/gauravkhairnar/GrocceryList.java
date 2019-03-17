package com.gauravkhairnar;

import java.util.ArrayList;

public class GrocceryList {

    private ArrayList<String> GrocceryList = new ArrayList<String>();  //this is the proper intro of an arraylist;

    public void addGrocceryItem(String s){
        GrocceryList.add(s);
    }
    public void removeGrocceryItem(int x){
        System.out.println((x+1)+". "+GrocceryList.get(x)+" has been removed !!");
        GrocceryList.remove(x);
    }
    public void printGrocceryItem(int l){
        System.out.println(l+". "+GrocceryList.get(l));           //groccerylist.get() is used to get the value in the l place
    }
    public void printGrocceryList(){
        for(int i = 0;i < GrocceryList.size();i++){
            System.out.println((i+1)+". "+GrocceryList.get(i));
        }
    }
    public void searchAndDeleteItem(String Search){
        boolean exists = GrocceryList.contains(Search);

        int position = GrocceryList.indexOf(Search);
        GrocceryList.remove(position);
    }
    public int getIndex(String k){
        int found = GrocceryList.indexOf(k);
        return found;
    }
}
