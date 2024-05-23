package org.codingdojo;

import org.codingdojo.yatzy1.Yatzy1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Yatzy1Test {

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#initException")
    public void should_throw_exception_(int exceptScore, int[] dices) {
        assertThrows(RuntimeException.class, () -> new Yatzy1(dices).chance());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#chance")
    public void should_test_chance(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).chance());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#yatzy")
    public void should_test_yatzy(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).yatzy());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#ones")
    public void should_test_one(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).ones());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#twos")
    public void should_test_twos(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).twos());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#threes")
    public void should_test_threes(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).threes());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#fours")
    public void should_test_fours(int exceptScore, int[] dices)
    {
        assertEquals(exceptScore, new Yatzy1(dices).fours());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#fives")
    public void should_test_fives(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).fives());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#sixes")
    public void should_test_sixes(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).sixes());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#pair")
    public void should_test_pair(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).pair());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#twoPair")
    public void should_test_two_Pair(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).twoPair());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#threeOfKind")
    public void should_test_three_of_a_kind(int exceptScore, int[] dices)
    {
        assertEquals(exceptScore, new Yatzy1(dices).threeOfAKind());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#fourOfKind")
    public void should_test_four_of_a_kind(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).fourOfAKind());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#smallStraigh")
    public void should_test_small_straight(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).smallStraight());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#largeStraigh")
    public void should_test_large_straight(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).largeStraight());
    }

    @ParameterizedTest
    @MethodSource("org.codingdojo.ArgumentProvider#fullHouse")
    public void should_test_full_house(int exceptScore, int[] dices) {
        assertEquals(exceptScore, new Yatzy1(dices).fullHouse());
    }
}
