package day8.LearningCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CheckPritingOrderArrayList {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers  = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        firstFivePrimeNumbers.remove(firstFivePrimeNumbers.indexOf(7));


        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
