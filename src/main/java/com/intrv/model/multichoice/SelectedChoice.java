package com.intrv.model.multichoice;

import com.intrv.model.Question;

public interface SelectedChoice extends Question {

    default boolean isSelected() {
        return true;
    }

}
