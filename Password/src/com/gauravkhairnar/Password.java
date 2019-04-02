package com.gauravkhairnar;

public class Password {
    private static final int key = 54759;
    private final int encryptedPassword;

    public Password(int Password) {
        this.encryptedPassword = encryptAndDecrypt(Password);
    }

    private int encryptAndDecrypt(int password){
        return password ^ key;   //uses an xor gate to alter the values
    }

    public String  letMeIn(int p){
        return encryptAndDecrypt(p) == this.encryptedPassword ? "You are logged in !" :"Oops Wrong password";
    }
}
