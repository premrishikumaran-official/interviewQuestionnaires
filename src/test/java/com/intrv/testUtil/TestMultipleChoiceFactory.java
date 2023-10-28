package com.intrv.testUtil;



import com.intrv.helper.MultiChoiceHelper;
import com.intrv.helper.ScoreHelper;

import java.util.List;

public class TestMultipleChoiceFactory {

    public static List<ScoreHelper> getSelectedChoiceAnswerList() {
        ScoreHelper afterSchoolClub = new MultiChoiceHelper().setValue(1);
        ScoreHelper homeSchooling = new MultiChoiceHelper().setValue(1);
        ScoreHelper onlineTutoring = new MultiChoiceHelper().setValue(1);
        return List.of(afterSchoolClub,homeSchooling,onlineTutoring);
    }

    public static List<ScoreHelper> getSelectedChoiceWithAfterSchoolAndHomeSchool() {
        ScoreHelper afterSchoolClub = new MultiChoiceHelper().setValue(1);
        ScoreHelper homeSchooling = new MultiChoiceHelper().setValue(1);
        ScoreHelper onlineTutoring = new MultiChoiceHelper().setValue(1);
        return List.of(afterSchoolClub,homeSchooling);
    }
}
