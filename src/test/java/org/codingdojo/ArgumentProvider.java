package org.codingdojo;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ArgumentProvider {
    static Stream<Arguments> initException() {
        return Stream.of(
            Arguments.of(15, new int[]{2, 3, 4, 5, 1,4}),
            Arguments.of(16, new int[]{9, 3, 4, 5, 8})
        );
    }
    static Stream<Arguments> chance() {
        return Stream.of(
            Arguments.of(15, new int[]{2, 3, 4, 5, 1}),
            Arguments.of(16, new int[]{3, 3, 4, 5, 1})
        );
    }

    static Stream<Arguments> yatzy() {
        return Stream.of(
            Arguments.of(50, new int[]{4, 4, 4, 4, 4}),
            Arguments.of(50, new int[]{6, 6, 6, 6, 6}),
            Arguments.of(0, new int[]{6, 6, 6, 6, 3})
        );
    }

    static Stream<Arguments> ones() {
        return Stream.of(
            Arguments.of(1, new int[]{1, 2, 3, 4, 5}),
            Arguments.of(2, new int[]{1, 2, 1, 4, 5}),
            Arguments.of(0, new int[]{6, 2, 2, 4, 5}),
            Arguments.of(4, new int[]{1, 2, 1, 1, 1})
        );
    }

    static Stream<Arguments> twos() {
        return Stream.of(
            Arguments.of(4, new int[]{1, 2, 3, 2, 6}),
            Arguments.of(10, new int[]{2, 2, 2, 2, 2})
        );
    }

    static Stream<Arguments> threes() {
        return Stream.of(
            Arguments.of(6, new int[]{1, 2, 3, 2, 3}),
            Arguments.of(12, new int[]{2, 3, 3, 3, 3})
        );
    }

    static Stream<Arguments> fours() {
        return Stream.of(
            Arguments.of(12, new int[]{4, 4, 4, 5, 5}),
            Arguments.of(8, new int[]{4, 4, 5, 5, 5}),
            Arguments.of(4, new int[]{4, 5, 5, 5, 5})
        );
    }

    static Stream<Arguments> fives() {
        return Stream.of(
            Arguments.of(10, new int[]{4, 4, 4, 5, 5}),
            Arguments.of(15, new int[]{4, 4, 5, 5, 5}),
            Arguments.of(20, new int[]{4, 5, 5, 5, 5})
        );
    }


    static Stream<Arguments> sixes() {
        return Stream.of(
            Arguments.of(0, new int[]{4, 4, 4, 5, 5}),
            Arguments.of(6, new int[]{4, 4, 6, 5, 5}),
            Arguments.of(18, new int[]{6, 5, 6, 6, 5})
        );
    }

    static Stream<Arguments> pair() {
        return Stream.of(
            Arguments.of(6, new int[]{3, 4, 3, 5, 6}),
            Arguments.of(10, new int[]{5, 3, 3, 3, 5}),
            Arguments.of(12, new int[]{5, 3, 6, 6, 5})
        );
    }

    static Stream<Arguments> twoPair() {
        return Stream.of(
            Arguments.of(16, new int[]{3, 3, 5, 4, 5}),
            Arguments.of(16, new int[]{3, 3, 5, 5, 5}),
            Arguments.of(6, new int[]{1, 1, 2, 2, 2})
        );
    }

    static Stream<Arguments> threeOfKind() {
        return Stream.of(
            Arguments.of(9, new int[]{3, 3, 3, 3, 5}),
            Arguments.of(15, new int[]{5, 3, 5, 4, 5}),
            Arguments.of(9, new int[]{3, 3, 3, 3, 5})
        );
    }

    static Stream<Arguments> fourOfKind() {
        return Stream.of(
            Arguments.of(12, new int[]{3, 3, 3, 3, 5}),
            Arguments.of(20, new int[]{5, 5, 5, 4, 5}),
            Arguments.of(12, new int[]{3, 3, 3, 3, 3})
        );
    }

    static Stream<Arguments> smallStraigh() {
        return Stream.of(
            Arguments.of(15, new int[]{1, 2, 3, 4, 5}),
            Arguments.of(15, new int[]{2, 3, 4, 5, 1}),
            Arguments.of(0, new int[]{1, 2, 2, 4, 5})
        );
    }

    static Stream<Arguments> largeStraigh() {
        return Stream.of(
            Arguments.of(20, new int[]{6, 2, 3, 4, 5}),
            Arguments.of(20, new int[]{2, 3, 4, 5, 6}),
            Arguments.of(0, new int[]{1, 2, 2, 4, 5})
        );
    }

    static Stream<Arguments> fullHouse() {
        return Stream.of(
            Arguments.of(18, new int[]{6, 2, 2, 2, 6}),
            Arguments.of(0, new int[]{2, 3, 4, 5, 6})
        );
    }
}
