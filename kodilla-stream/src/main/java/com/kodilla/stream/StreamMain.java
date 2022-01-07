package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifer;


public class StreamMain {

    public static void main (String[] args){

        PoemBeautifer poemBeautifer = new PoemBeautifer();

        System.out.println("Word beautifer with lambdas");
        poemBeautifer.beautify("tekst","tekst", (a,b)->a.toUpperCase() + " " + b.toUpperCase());
        poemBeautifer.beautify("Tekst", "Tekst", (a,b)-> a.concat("ABC")+ " " + b.concat("ABC"));
        poemBeautifer.beautify("tekst", "tekst", (a,b)->a.replace("t","T")+" "+ b.replace("t", "T"));
        poemBeautifer.beautify("TEKST", "TEKST", (a,b)->a.toLowerCase() + " "+b.toLowerCase());


    }
}


