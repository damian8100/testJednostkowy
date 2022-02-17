package com.kodilla.good.patterns.challenges.Flight;

public class TheFlightProcessor {

    TheFlightRepository theFlightRepository;

    public TheFlightProcessor(TheFlightRepository theFlightRepository) {
        this.theFlightRepository = theFlightRepository;
    }
    public void execute() {

        theFlightRepository.searchAflight();
    }
}
