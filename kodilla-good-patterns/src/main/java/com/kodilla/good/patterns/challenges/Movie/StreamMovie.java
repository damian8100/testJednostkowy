package com.kodilla.good.patterns.challenges.Movie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMovie {

        public static void main(String[] args) {

            MovieStore movieStore = new MovieStore();

            Map<String, List<String>> theResult = movieStore.getMovies();
            String result = theResult.entrySet().stream()
                    .flatMap(e->e.getValue().stream())
                    .collect(Collectors.joining("!"));

            System.out.println(result);



    }
}
//