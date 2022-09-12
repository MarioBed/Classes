package mari.classes.easy;

import java.util.List;

public class EasyClass {

    private static final String NRK = "NieRuszKurwa";

    /**
     * Metoda ma za zadanie policzyć średnią arytmetyczną z przekazanej do metody listy ocen 'grades'
     * @param grades - lista ocen do wyliczenia średniej
     * @return średnia arytmetyczna z listy ocen 'grades'
     */
    public double countSimpleAverage(List<Integer> grades) {
        //IMPLEMENT ME PLS
        return 0.0;
    }

    /**
     * Metoda ma za zadanie posortowanie wartości słownikowych 'records'
     * po id rosnąca, następnie jeśli id są takie same to po nazwie malejąco,
     * następnie jeśli nazwy są takie same to po kodzie malejąco
     * @param records lista rekordów do posortowania
     * @return posortowana lista zgodnie z poleceniem
     */
    public List<DictionaryRecord> sortDictByIdNameAndCode(List<DictionaryRecord> records) {
        //IMPLEMENT ME PLS
        return null;
    }

    /**
     * Metoda ma za zadanie modyfikację tekstów w liscie 'inputList' tak, aby każdy tekst który zawiera w sobie
     * String NRK (pole statyczne w tej klasie) został z niego oczyszczony a następnie dodany na końcu tekstu.
     * Jeśli tekst nie zawiera w sobie Stringa NRK to nie powinien on się znaleźć w liście zwróconej przez metodę.
     * Jeśli tekst zawiera jedynie String NRK to również nie powinien się znaleźć w liście zwróconej przez metodę.
     * @param inputList - wejśćiowa lista Stringów
     * @return zmodyfikowana zgodnie z poleceniem lista 'inputList'
     */
    public List<String> normalizeTexts(List<String> inputList) {
        //IMPLEMENT ME PLS
        return null;
    }
}
