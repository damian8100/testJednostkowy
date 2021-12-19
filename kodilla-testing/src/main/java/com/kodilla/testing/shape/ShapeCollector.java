package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private List<Shape> collectionShapeList = new ArrayList<>(); //Lista przechowująca kształty  o nazwie collectionShapeList w kolekcji ArrayList

    public ShapeCollector() { // konstruktor

    }



    public List<Shape> getCollectionShapeList() {
        return collectionShapeList;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                ", collectionShapeList=" + collectionShapeList +
                '}';

    }
    public void addFigure (Shape shape) {
        collectionShapeList.add(shape);
    }

    public void removeFigure(Shape shape){
        collectionShapeList.remove(shape);
    }

    public Shape getFigure (int n){
        if(n>=0 && n<collectionShapeList.size()){//jesli n jest wieksze od zera  i n jest wieksze od
            return collectionShapeList.get(n);

        }
        return null; //zwraca puste pole
    }

    public void showFigures(){
        System.out.println(collectionShapeList.toString());
    }
    }

