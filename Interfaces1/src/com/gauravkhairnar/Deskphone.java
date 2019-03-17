package com.gauravkhairnar;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Deskphone implements ITelephone {    //implements keyword is used to implement;
                                                  //also we need to override "all" the functions compulsarily to implement it
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
     //   this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("Its always on!!");
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on the deskphone!");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            System.out.println("The phone is ringing!");
            isRinging = true;
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void answer() {
        if(isRinging()){
            System.out.println("Now answering the phone");
            isRinging = false;
        }

    }
}
