package com.kodilla.testing.collection;

import java.util.*;


public class OddNumbersExterminator {


        //(List<Integer> to co metoda exterminate ma zwraac
    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer>oddList = new ArrayList<>();

        for(int i = 0;i<numbers.size(); i++ ){
            int n = numbers.get(i); // pobieram z list numbers wartośći z tej listy
            if ( n %2 ==0){
            oddList.add(n);} // pobieramy n sprawdzamy czy jest parzyste lub nie i dodajemy do nowej listy oddlist zwracanej w return

        }

        return oddList ;
    }

}
