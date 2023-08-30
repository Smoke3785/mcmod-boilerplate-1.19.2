package com.iliad.smokeshulkersexpanded.utils;

import java.util.Random;

public class NonRepeatingRandomNumber {

    private int previous;
    private int min;
    private int max;

    public NonRepeatingRandomNumber(int min, int max) {
        this.min = min;
        this.max = max;
        this.previous = new Random().nextInt(max - min + 1) + 1;
    }

    public NonRepeatingRandomNumber() {
        this(1, 10);
    }

    public int get(int min, int max) {
        int range = max - min + 1;
        boolean valid = false;

        Random random = new Random();
        int result = 0;

        while (!valid) {
            result = random.nextInt(range) + 1;

            if (result != previous) {
                previous = result;
                valid = true;
            }
        }

        return result;
    }

    public int get() {
        return get(min, max);
    }

    public int getPrevious() {
        return previous;
    }
}
