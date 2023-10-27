package com.intrv.util;



import com.intrv.multichoice.SelectedChoice;

import java.util.List;

public class TestMultipleChoiceFactory {

    public static List<SelectedChoice> getSelectedChoiceAnswerList() {
        SelectedChoice selectedChoiceAnswer1 = () -> true;
        SelectedChoice selectedChoiceAnswer2 = () -> true;
        SelectedChoice selectedChoiceAnswer3 = () -> false;
        return List.of(selectedChoiceAnswer1,selectedChoiceAnswer2,selectedChoiceAnswer3);
    }
}
