package org.codingdojo.yatzy1;

import java.util.Arrays;

public enum YatzyType {
    SMALL_STRAIGHT{
        @Override
        public int calculateScore(Integer occurence, int[] counts) {
            return Arrays.stream(counts).allMatch(dice -> dice <= 1) ? 15 : 0;
        }
    },
    LARGE_STRAIGHT{
        @Override
        public int calculateScore(Integer occurence, int[] counts) {
            return Arrays.stream(counts).allMatch(dice -> dice <= 1) ? 20 : 0;
        }
    },
    KIND {
        @Override
        public int calculateScore(Integer occurence, int[] counts){
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] >= occurence) {
                    return (i + 1) * occurence;
                }
            }
            return 0;
        }
    },
    FULL_HOUSE {
        @Override
        public int calculateScore(Integer occurence, int[] counts){
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] == occurence) {
                    return (i + 1) * occurence;
                }
            }
            return 0;
        }
    },
    PAIR {
        @Override
        public int calculateScore(Integer occurence, int[] counts){
            int score = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[counts.length - i - 1] >= Yatzy1.TWO) {
                    if (occurence == 1) return (counts.length - i) * 2;
                    score += (counts.length - i);
                }
            }
            return score * 2;
        }
    };

    public abstract int calculateScore(Integer occurence, int[] counts);
}
