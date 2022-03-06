package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User arek = new Millenials("Arek Kowalczyk");
        User jan = new ZGeneration("Jan Kowalski");
        User andrzej = new YGeneration("Andrzej Nowak");

        //When
        String arekSharePost = arek.sharePost();
        System.out.println("Arek share post: " + arekSharePost);
        String janSharePost = jan.sharePost();
        System.out.println("Jan share Post: " + janSharePost);
        String andrzejSharePost = andrzej.sharePost();
        System.out.println("Andrzej share Post: " + andrzejSharePost);

        //Then
        assertEquals("This is Snapchat Publisher", arekSharePost);
        assertEquals("This is Twitter Publisher", janSharePost);
        assertEquals("This is Facebook Publisher", andrzejSharePost);


    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User arek = new Millenials("Arek Kowalczyk");

        //When
        String arekSharePost = arek.sharePost();
        System.out.println("Arek share post: " + arekSharePost);
        arek.setSocialPublishing(new TwitterPublisher());
        arekSharePost = arek.sharePost();
        System.out.println("Arek now share post: " + arekSharePost);

        //Then
        assertEquals("This is Twitter Publisher", arekSharePost);

    }
}
