package org.prog.poly.homework;

//TODO: Add interface IPhone
//TODO: Add interface method for call
//TODO: Add interface method for unlock
//TODO: Add class for Androind and iOS phones that implement IPhone
   //asdf
public class PolyHomework {

    public static void main(String[] args) {
        //TODO: create Android and IOS phones, and call usePhone() for both
        Android android = new Android();
        iOS ios = new iOS();

        usePhone(android);
        usePhone(ios);



    }

    public static void usePhone(IPhone iPhone)     {
         iPhone.call();
         iPhone.unlock();

    }
}
