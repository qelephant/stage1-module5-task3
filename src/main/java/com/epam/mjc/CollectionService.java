package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    // Task 1: Stream Filter
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    // Task 2: Stream Map
    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // Task 3: Stream Max
    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream()
                .max(Integer::compareTo);
    }

    // Task 4: Stream FlatMap
    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(List::stream)
                .min(Integer::compareTo);
    }

    // Task 5: Stream Reduce
    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}



