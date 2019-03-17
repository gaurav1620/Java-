package com.gauravkhairnar;

public class Mobile  implements ITelephone{    //implements keyword is used to implement;
    //also we need to override "all" the functions compulsarily to implement it
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public Mobile(int myNumber) {
        this.myNumber = myNumber;
        //   this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("Turned on your phone ...");
        isOn = true;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {

        if (isOn){
            System.out.println("Now dialing "+phoneNumber+" on the deskphone!...");
        }else {
            System.out.println("The phone is off!! ...");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (isOn){
            if(phoneNumber == myNumber){
                System.out.println("The phone is ringing!");
                isRinging = true;
            }else{
                isRinging = false;
            }
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void answer() {
        if(isRinging() && isOn){
            System.out.println("Now answering the phone");
            isRinging = false;
        }

    }
}


