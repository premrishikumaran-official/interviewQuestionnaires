package com.intrv.model.multichoice;

import java.util.Objects;

public class MultiSelectionChoice {


    private String type;

    private boolean selected;

    public MultiSelectionChoice(String type, boolean selected) {
        this.type = type;
        this.selected = selected;
    }

    public MultiSelectionChoice() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MultiSelectionChoice)) return false;

        MultiSelectionChoice that = (MultiSelectionChoice) o;

        if (selected != that.selected) return false;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (selected ? 1 : 0);
        return result;
    }
}
