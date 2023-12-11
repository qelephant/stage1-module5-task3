package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .map(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(List::stream)
                .max(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(1, Integer::sum);
    }
}
