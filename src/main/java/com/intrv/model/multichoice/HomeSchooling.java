package com.intrv.model.multichoice;

public class HomeSchooling implements SelectedChoice {
    private int value;

    @Override
    public void setValue(int value) {
        this.value=value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
