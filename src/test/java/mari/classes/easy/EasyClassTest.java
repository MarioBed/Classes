package mari.classes.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Aby wykonać zadanie należy zaimplementować metody w klasie EasyClass tak aby testy poniżesz zakończył się sukcesem.
 */
class EasyClassTest {

    EasyClass easyClass = new EasyClass();

    @Test
    void countSimpleAverages() {
        double average1 = easyClass.countSimpleAverage(Arrays.asList(4,2,1,3,2,3,1,5,1,2,6,5,5));
        assertEquals(3.076923076923077, average1);

        double average2 = easyClass.countSimpleAverage(Arrays.asList(5,5,5,5,5,5,4,5,2,3,4,5,2));
        assertEquals(4.230769230769231, average2);

        double average3 = easyClass.countSimpleAverage(Arrays.asList(5,5,5,5,5,5,4,4,4,4,4,4));
        assertEquals(4.5, average3);
    }

    @Test
    void sortDictByIdNameAndCode() {
        List<DictionaryRecord> recordList1 = List.of(
                getRecord(2L, "Weed", "Herb"),
                getRecord(2L, "Weed", "Zioło"),
                getRecord(1L, "Meth", "Crystal"),
                getRecord(1L, "Meth", "Kryształ"),
                getRecord(3L, "Alcohol", "Liquid"),
                getRecord(3L, "Alcohol", "Alko"),
                getRecord(4L, "Cocaine", "Coco"),
                getRecord(4L, "Cocaine", "Koks"),
                getRecord(5L, "MDMA", "Edibles"),
                getRecord(5L, "MDMA", "Emka"));
        List<DictionaryRecord> sortedList1 = easyClass.sortDictByIdNameAndCode(recordList1);

        assertEquals(sortedList1.size(), recordList1.size());
        assertEquals(sortedList1.get(5).getId(), sortedList1.get(5).getId());
        assertEquals(sortedList1.get(9).getCode(), sortedList1.get(9).getCode());
        assertEquals(sortedList1.get(0).getName(), "Meth");
        assertEquals(sortedList1.get(1).getCode(), "Crystal");
        assertEquals(sortedList1.get(5).getCode(), "Alko");
        assertEquals(sortedList1.get(7).getCode(), "Coco");
        assertEquals(sortedList1.get(9).getCode(), "Edibles");


        List<DictionaryRecord> recordList2 = List.of(
                getRecord(212L, "Artur", "Beast"),
                getRecord(12L, "Artur", "Best"),
                getRecord(1L, "Artur", "Baddest"),
                getRecord(1L, "Harvey", "Harv"),
                getRecord(1L, "Harvey", "Boobs"),
                getRecord(1L, "Harvey", "Yavreh"),
                getRecord(1L, "Dario", "Dario"),
                getRecord(11L, "Barbara", "Barb"),
                getRecord(11L, "Barbara", "Ara"),
                getRecord(431231L, "Barbara", "Bara"),
                getRecord(25L, "Mario", "Mario"),
                getRecord(65L, "Mario", "Bros"),
                getRecord(25L, "Mario", "Bros"));
        List<DictionaryRecord> sortedList2 = easyClass.sortDictByIdNameAndCode(recordList2);

        assertEquals(sortedList2.size(), recordList2.size());
        assertEquals(sortedList2.get(0).getId(), sortedList2.get(4).getId());
        assertEquals(sortedList2.get(5).getId(), 11L);
        assertEquals(sortedList2.get(11).getId(), 212L);
        assertEquals(sortedList2.get(0).getCode(), "Yavreh");
        assertEquals(sortedList2.get(8).getName(), "Mario");
        assertEquals(sortedList2.get(9).getName(), "Mario");
        assertEquals(sortedList2.get(9).getCode(), "Bros");
        assertEquals(sortedList2.get(11).getName(), "Artur");
        assertEquals(sortedList2.get(11).getCode(), "Beast");
        assertEquals(sortedList2.get(4).getName(), "Artur");


    }

    @Test
    void normalizeTexts() {
        List<String> listToNormalize1 = List.of(
                "NieRuszKurwa Suboferta1",
                "Subofer Nie Rusz Kurwa Bo Moja",
                "CleanSuboffer",
                "RuszKurwaToZabije",
                "Rusz Kurwa To Zabije Wiec Nie Rus zKur wa NieRuszKurwa",
                "ShouldNotBeReturnedKurwa",
                "EternalSubofferDontTouch");

        List<String> outcome1 = easyClass.normalizeTexts(listToNormalize1);

        for(String string : outcome1) {
            assertFalse(string.contains(" "));
        }
        assertEquals(3, outcome1.size());
        assertEquals("Suboferta1NieRuszKurwa", outcome1.get(0));
        assertEquals("RuszKurwaToZabijeWiecNieRuszKurwa", outcome1.get(2));

        List<String> listToNormalize2 = List.of(
                "NieRuszKurwa",
                "Nie Rusz Kurwa",
                "Nie Rusz KurwaPLS",
                "SuboferNieRuszKurwBoMoja",
                "NieRuszKurwaSuboffer from",
                "No Nie Rusz Kurwa Tego",
                "RuszKurwa ToZabijeWiecNieRuszKu rwaNieRuszKurwa",
                "ShouldNotBeReturnedKurwa",
                "Eterna lSuboffer DontTouch",
                "Nie RuszKurwa Tej Suboferty Bo Zepsujesz");

        List<String> outcome2 = easyClass.normalizeTexts(listToNormalize2);

        for(String string : outcome2) {
            assertFalse(string.contains(" "));
        }
        assertEquals(5, outcome2.size());
        assertEquals("PLSNieRuszKurwa", outcome2.get(0));
        assertEquals("NoTegoNieRuszKurwa", outcome2.get(2));
        assertEquals("TejSubofertyBoZepsujeszNieRuszKurwa", outcome2.get(4));
    }

    private DictionaryRecord getRecord(Long id, String name, String code) {
        return new DictionaryRecord(id, name, code);
    }
}