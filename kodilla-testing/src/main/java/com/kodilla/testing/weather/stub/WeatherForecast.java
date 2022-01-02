package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateTemperatureAverage() {
        Map<String, Double> averageMap = temperatures.getTemperatures();
        double average = 0;
        double total = 0;

        for (Map.Entry<String, Double> Entry : averageMap.entrySet()) {
            total += Entry.getValue();

        }
        average = total / averageMap.size();
        System.out.println("Average is: " + average);
        return average;

    }

    public double calculateMedianTemperatureForOddNumber() {
        Map<String, Double> medianMap = temperatures.getTemperatures();

        Collection<Double> valuesMedian = medianMap.values();
        List<Double> medianList = new ArrayList<>();

        for (double i : valuesMedian) {

            medianList.add(i);
        }

        Collections.sort(medianList);
        double median = 0;
        if (medianList.size() % 2 == 0) {
            median = medianList.get(medianList.size() - 1 / 2);
        } else {
            median = ((medianList.get(medianList.size() - 1) / 2) + medianList.get(medianList.size() / 2)) / 2;
        }
        System.out.println("Odd number Median is: "+ median);
        return median;

    }
    public double calculateMedianTemperatureForEvemNumber() {
        Map<String, Double> medianMap = temperatures.getTemperatures();

        Collection<Double> valuesMedian = medianMap.values();
        List<Double> medianEvenList = new ArrayList<>();

        for (double i : valuesMedian) {

            medianEvenList.add(i);
        }

        Collections.sort(medianEvenList);
        double evenmedian = medianEvenList.size()/2;
        if(medianEvenList.size()%2==1){
            evenmedian=medianEvenList.get(medianEvenList.size()/2);
        }
        System.out.println("Even number median is: "+evenmedian);
        return evenmedian;

}}