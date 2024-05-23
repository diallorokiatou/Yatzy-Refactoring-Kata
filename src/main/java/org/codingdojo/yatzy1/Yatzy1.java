package org.codingdojo.yatzy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Yatzy1 {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    int ROLL_SIZE = 5;
    int MIN_DICE_SIDE = 1;
    int MAX_DICE_SIDE = 6;

    private final List<Integer> dices;

    public Yatzy1(int ...dices)
    {
        checkDiceConformity(dices);
        this.dices = new ArrayList<>(ROLL_SIZE);
        for (int d : dices){
            this.dices.add(d);
        }
    }

    private void checkDiceConformity(int[] dices) {
        if(dices.length > ROLL_SIZE){
            throw new RuntimeException();
        }
        if(Arrays.stream(dices).anyMatch(dice -> dice < MIN_DICE_SIDE || dice >  MAX_DICE_SIDE)){
            throw  new RuntimeException();
        }
    }

    public int chance()
    {
        return sumOfAllDice();
    }

    public int yatzy()
    {
        return dices.stream().allMatch(item -> Objects.equals(item, dices.get(0))) ? 50 : 0;
    }

    public int ones() {
        return sumOf(ONE);
    }

    public int twos() {
        return sumOf(TWO);

    }

    public int threes() {
        return sumOf(THREE);
    }

    public int fours()
    {
        return sumOf(FOUR);
    }

    public int fives()
    {
        return sumOf(FIVE);
    }

    public int sixes()
    {
        return sumOf(SIX);
    }

    public int largeStraight()
    {
        if(dices.contains(1)) return 0;
        return scoreOf(null, YatzyType.LARGE_STRAIGHT);

    }

    public int smallStraight()
    {
        return scoreOf(null, YatzyType.SMALL_STRAIGHT);
    }

    public int pair()
    {
        return scoreOf(ONE, YatzyType.PAIR);
    }

    public int twoPair()
    {
        return scoreOf(TWO, YatzyType.PAIR);
    }

    public int threeOfAKind()
    {
        return scoreOf(THREE, YatzyType.KIND);
    }

    public int fourOfAKind()
    {
        return scoreOf(FOUR, YatzyType.KIND);
    }

    public int fullHouse()
    {
        return scoreOf(THREE, YatzyType.FULL_HOUSE) + scoreOf(TWO, YatzyType.FULL_HOUSE);
    }

    private Integer sumOf(int diceSide) {
        return dices.stream().filter(item -> item == diceSide).reduce(Integer::sum).orElse(0);
    }

    private Integer sumOfAllDice() {
        return dices.stream().reduce(Integer::sum).orElse(0);
    }
    
    private int scoreOf(Integer occurence, YatzyType type) {
        int[] counts = getTallies();
        return  type.calculateScore(occurence, counts);
    }

    private int[] getTallies() {
        int[] counts = new int[6];
        for(int dice : dices){
            counts[dice - 1]++;
        }
        return counts;
    }
}



