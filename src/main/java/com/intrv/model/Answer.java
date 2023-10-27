package com.intrv.model;

public class Answer {

    private String id;
    //check boxed
    private boolean isMultiSelection;

    private Integer value;

    public Answer() {
    }

    public Answer(String id, boolean isMultiSelection, Integer value) {
        this.id = id;
        this.isMultiSelection = isMultiSelection;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMultiSelection() {
        return isMultiSelection;
    }

    public void setMultiSelection(boolean multiSelection) {
        isMultiSelection = multiSelection;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
