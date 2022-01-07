package com.kodilla.stream.beautifier;

public class PoemBeautifer {

    public void beautify(String a,String b, PoemDecorator poemDecorator)
    {
        String result = poemDecorator.decorate(a,b);
        System.out.println("Tekst po upiększeniu: " + "" + result);
    }
}
