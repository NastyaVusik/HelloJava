// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.HashSet;
import java.util.Set;

public class Hello_Java {
    public static void main(String[] args) {
        Set<String> qqq = addToLovelyCurrencies("m", "x");

        System.out.println(qqq);
    }

    public static Set<String> addToLovelyCurrencies(String fromCurrency, String toCurrency) {
        Set<String> lovelyCurrencies = new HashSet<>();
        int limit = 6;

        lovelyCurrencies.add("a");
        lovelyCurrencies.add("b");
        lovelyCurrencies.add("c");
        lovelyCurrencies.add("d");
        lovelyCurrencies.add("e");
        lovelyCurrencies.add("g");
        lovelyCurrencies.add("h");
        lovelyCurrencies.add("k");


        while ((!lovelyCurrencies.isEmpty()) & (lovelyCurrencies.size() < limit)) {
            lovelyCurrencies.remove(lovelyCurrencies.stream().iterator().next());
            lovelyCurrencies.remove(lovelyCurrencies.stream().iterator().next());
            lovelyCurrencies.add(fromCurrency);
            lovelyCurrencies.add(toCurrency);
        }

        return lovelyCurrencies;
    }
}


