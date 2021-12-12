package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {



    @BeforeEach
    public void before() {
        System.out.println("Test Odd Numbers Exterminator List: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Odd Numbers Exterminator List: end");
    }

    @DisplayName("when create the new Array List, the new variable result check that ArrayList is empty "
    )

    @Test
    void testOddNumberEmptyList() {
        //Given
        OddNumbersExterminator number = new OddNumbersExterminator();


        //When
        List<Integer> result = number.exterminate(new ArrayList<>());//wywołuje metode exterminate z obiektu  o nazwie number typu OddNumbersExterminator jako argument przekazuje pusta Arraylist zwracany wynik przypisywany jest do nowej zmiennej o nazwie result.
        //Then
        Assertions.assertTrue(result.isEmpty());
    }
    @DisplayName("when create the normalList, function assertions return even numbers ")
    @Test
    void testOddNumberNormalList() {
        //Given
        OddNumbersExterminator number = new OddNumbersExterminator();


        //When
        ArrayList<Integer>normalList = new ArrayList<Integer>(); //po znaku = Arrays.asList(3,5,8,12); zapis rownoznaczny z ponizszym zapisem add.cos tam
        normalList.add(3);
        normalList.add(5);
        normalList.add(8);
        normalList.add(12);
                                            //przekazujemy utworzona  Liste "normalList"
        List<Integer> result = number.exterminate(normalList);
        //Then liczba 2 - oczekiwany wynik
        Assertions.assertEquals(2,result.size());

    }
}
