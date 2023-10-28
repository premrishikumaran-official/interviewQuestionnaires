package com.intrv.model.singlechoice;

import java.util.Objects;

public class SingleSelection {

    private String type;

    private int value;

    public SingleSelection(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public SingleSelection() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleSelection)) return false;

        SingleSelection that = (SingleSelection) o;

        if (value != that.value) return false;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }
}
