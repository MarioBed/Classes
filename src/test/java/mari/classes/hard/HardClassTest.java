package mari.classes.hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


/**
 * To complete this task you have to:
 * 1. Uncomment everything below this java doc.
 * 2. Uncomment and adjust Pair class, so it conforms with the code in the tests below
 * 3. Uncomment and implement methods in HardClass class according to the comments above the methods
 * 4. All test below cannot be edited and should all pass after completing points 1-3.
 */
//@SuppressWarnings("unchecked")
//class HardClassTest<T> {
//
//    @Test
//    void shouldCountASimpleWeightedAverage() {
//        HardClass<Double, Integer> hardClass = new HardClass<>();
//        double average = hardClass.countMyWeightedAverage(Arrays.asList(
//                Pair.of(1.0, 4),
//                Pair.of(2.6, 5),
//                Pair.of(3.0, 6),
//                Pair.of(4.2, 3),
//                Pair.of(4.5, 3),
//                Pair.of(3.0, 3),
//                Pair.of(1.3, 1),
//                Pair.of(2.5, 3),
//                Pair.of(6.0, 5),
//                Pair.of(3.7, 3),
//                Pair.of(2.5, 3),
//                Pair.of(5.5, 2)));
//
//        assertEquals(3.3780487804878048, average);
//
//        double average2 = hardClass.countMyWeightedAverage(Arrays.asList(
//                Pair.of(1.0, 1),
//                Pair.of(2.6, 1),
//                Pair.of(3.4, 1),
//                Pair.of(2.8, 3),
//                Pair.of(6.0, 5),
//                Pair.of(3.7, 3),
//                Pair.of(2.5, 1),
//                Pair.of(4.2, 5),
//                Pair.of(4.5, 5),
//                Pair.of(3.1, 3),
//                Pair.of(1.2, 1),
//                Pair.of(5.5, 2)));
//
//        assertEquals(4.0, average2);
//    }
//
//    @Test
//    void shouldCountWeightedAverageWithStringWeights() {
//        HardClass<Double, T> hardClass = new HardClass<>();
//        double average = hardClass.countMyWeightedAverageWithStringTypeChecking(Arrays.asList(
//                Pair.of(1.0, "4"),
//                Pair.of(2.6, "5"),
//                Pair.of(3.0, "6"),
//                Pair.of(4.2, 3),
//                Pair.of(4.5, "3"),
//                Pair.of(3.0, 3),
//                Pair.of(1.3, 1),
//                Pair.of(2.5, "3"),
//                Pair.of(6.0, 5),
//                Pair.of(3.7, 3),
//                Pair.of(2.5, 3),
//                Pair.of(5.5, "2")));
//
//        assertEquals(3.3780487804878048, average);
//    }
//
//    @Test
//    void shouldThrowIllegalStateExceptionWhenParsingWeights() {
//        HardClass<Double, T> hardClass = new HardClass<>();
//
//        Exception exception = assertThrows(IllegalStateException.class, () ->
//                hardClass.countMyWeightedAverageWithStringTypeChecking(Arrays.asList(
//                Pair.of(1.0, "4"),
//                Pair.of(2.6, "w5w"),
//                Pair.of(3.0, "6"),
//                Pair.of(4.2, 3),
//                Pair.of(4.5, "3a"),
//                Pair.of(3.0, 3),
//                Pair.of(1.3, 1),
//                Pair.of(2.5, "3b"),
//                Pair.of(6.0, 5),
//                Pair.of(3.7, 3),
//                Pair.of(2.5, 3),
//                Pair.of(5.5, "2"))));
//
//        assertEquals("Weight must be a number.", exception.getMessage());
//        assertEquals(IllegalStateException.class, exception.getClass());
//    }
//}