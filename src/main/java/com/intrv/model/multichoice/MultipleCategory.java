package com.intrv.model.multichoice;

import java.util.List;
import java.util.Objects;

public class MultipleCategory {

    List<MultiSelectionChoice> checkboxes;

    public List<MultiSelectionChoice> getCheckboxes() {
        return checkboxes;
    }

    public void setCheckboxes(List<MultiSelectionChoice> checkboxes) {
        this.checkboxes = checkboxes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MultipleCategory)) return false;

        MultipleCategory that = (MultipleCategory) o;

        return Objects.equals(checkboxes, that.checkboxes);
    }

    @Override
    public int hashCode() {
        return checkboxes != null ? checkboxes.hashCode() : 0;
    }
}
