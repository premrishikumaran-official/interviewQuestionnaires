package com.intrv.helper;

public class MultiChoiceHelper implements ScoreHelper{

    private int value;
    @Override
    public ScoreHelper setValue(int val) {
        this.value = val;
        return this;
    }

    @Override
    public int calculateScore() {
        return value;
    }
}
