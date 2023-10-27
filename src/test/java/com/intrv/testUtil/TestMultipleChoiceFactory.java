package com.intrv.testUtil;



import com.intrv.model.multichoice.AfterSchoolClub;
import com.intrv.model.multichoice.HomeSchooling;
import com.intrv.model.multichoice.OnlineTutoring;
import com.intrv.model.multichoice.SelectedChoice;

import java.util.List;

public class TestMultipleChoiceFactory {

    public static List<SelectedChoice> getSelectedChoiceAnswerList() {
        SelectedChoice selectedChoiceAnswer1 = new AfterSchoolClub();
        SelectedChoice selectedChoiceAnswer2 = new HomeSchooling();
        SelectedChoice selectedChoiceAnswer3 = new OnlineTutoring();
        return List.of(selectedChoiceAnswer1,selectedChoiceAnswer2,selectedChoiceAnswer3);
    }

    public static List<SelectedChoice> getSelectedChoiceWithAfterSchoolAndHomeSchool() {
        SelectedChoice selectedChoiceAnswer1 = new AfterSchoolClub();
        SelectedChoice selectedChoiceAnswer2 = new HomeSchooling();
        return List.of(selectedChoiceAnswer1,selectedChoiceAnswer2);
    }
}
