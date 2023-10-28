package com.intrv.model;

import com.intrv.model.multichoice.MultipleCategory;
import com.intrv.model.singlechoice.SingleCategory;

import java.util.Objects;

public class Answer {

    MultipleCategory multipleCategory;

    SingleCategory singleCategory;

    public MultipleCategory getMultipleCategory() {
        return multipleCategory;
    }

    public void setMultipleCategory(MultipleCategory multipleCategory) {
        this.multipleCategory = multipleCategory;
    }

    public SingleCategory getSingleCategory() {
        return singleCategory;
    }

    public void setSingleCategory(SingleCategory singleCategory) {
        this.singleCategory = singleCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;

        Answer answer = (Answer) o;

        if (!Objects.equals(multipleCategory, answer.multipleCategory))
            return false;
        return Objects.equals(singleCategory, answer.singleCategory);
    }

    @Override
    public int hashCode() {
        int result = multipleCategory != null ? multipleCategory.hashCode() : 0;
        result = 31 * result + (singleCategory != null ? singleCategory.hashCode() : 0);
        return result;
    }
}
