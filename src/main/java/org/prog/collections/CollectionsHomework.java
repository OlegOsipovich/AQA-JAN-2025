package org.prog.collections;

//TODO: write collection of cars (MAP/SET/LIST)
//TODO: WHERE: CAR CAN HAVE NO OWNER
//TODO: WHERE: CAR CAN HAVE 1 OR MORE OWNERS
//TODO: Write method that will print all owners sharing car

import org.prog.parent.Car;

import java.util.*;

/**
 * Car1 -> John
 * Car2 -> John, Jane
 * Car3 -> Jane
 * Car4 ->
 * Car5 -> Sarah, Peter
 * Car6 -> Peter
 * Car7 -> Bob
 * Car8 -> Ivy
 * expected result: Peter, Sarah, John, Jane
 */

public class CollectionsHomework {

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>() ;


        ArrayList<String> ownerList = new ArrayList<>() ;
        ownerList.add("John");
        ownerList.add("Jane");
        ownerList.add("Sarah");
        ownerList.add("Peter");
        ownerList.add("Bob");
        ownerList.add("Ivy");




        Map<String, List<String>> ownedCars = new HashMap<>();

        ownedCars.put(ownerList.get(0), new ArrayList<>() ); //John
        ownedCars.put(ownerList.get(1), new ArrayList<>() ); //Jane
        ownedCars.put(ownerList.get(2), new ArrayList<>() ); //Sarah
        ownedCars.put(ownerList.get(3), new ArrayList<>() ); //Peter
        ownedCars.put(ownerList.get(4), new ArrayList<>() ); //Bob
        ownedCars.put(ownerList.get(5), new ArrayList<>() ); //Ivy





        ownedCars.get(ownerList.get(0)).add("Car1"); //John
        ownedCars.get(ownerList.get(0)).add("Car2"); //John

        ownedCars.get(ownerList.get(1)).add("Car2"); //Jane
        ownedCars.get(ownerList.get(1)).add("Car3"); //Jane

        ownedCars.get(ownerList.get(2)).add("Car5"); //Sarah

        ownedCars.get(ownerList.get(3)).add("Car5"); //Peter
        ownedCars.get(ownerList.get(3)).add("Car6"); //Peter

        ownedCars.get(ownerList.get(4)).add("Car7"); //Bob

        ownedCars.get(ownerList.get(5)).add("Car8"); //Bob



        for (int i = 0; i< ownedCars.size(); i++ ) {
            if (ownedCars.get(ownerList.get(i)).size() > 1) {
                result.add(ownerList.get(i)) ;
            }
        }
        //System.out.println(ownedCars.size());
        //System.out.println(ownedCars.get(ownerList.get(0)).size());
        //System.out.println(ownerList.get(0));


        System.out.println(result);
    }
}
