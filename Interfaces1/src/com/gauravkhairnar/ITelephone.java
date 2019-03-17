package com.gauravkhairnar;

public interface ITelephone {
    void powerOn();
    boolean isRinging();
    void dial(int phoneNumber);
    boolean callPhone(int phoneNumber);
    void answer();
}
