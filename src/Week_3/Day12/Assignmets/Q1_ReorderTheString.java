package coreJAVA.Week_1.Day_12;
/**
 * Accept the strings(HARD CODE VALUES/USER ACCEPTED),as per their length and
 * reorder it.
 */
import java.util.Arrays;
import java.util.Comparator;

public class Q1_ReorderTheString {
    public static void main(String[] args) {
        String[] array = {"Devaysuh","Anuj","Abhishek","Zulfa","UsmanBurkati"};
        Arrays.sort(array, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(array));
    }
}

//OUTPUT --> [Anuj, Zulfa, Devaysuh, Abhishek, UsmanBurkati]