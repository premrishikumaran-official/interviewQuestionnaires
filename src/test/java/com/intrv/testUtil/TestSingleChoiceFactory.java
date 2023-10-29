package com.intrv.testUtil;


import com.intrv.helper.ScoreHelper;
import com.intrv.helper.TutoringYearsScoreHelper;

import java.util.List;

public class TestSingleChoiceFactory {

    public static List<ScoreHelper> getTutoringYears1() {
        TutoringYearsScoreHelper singleChoiceAnswer1 = new TutoringYearsScoreHelper();
        singleChoiceAnswer1.setValue(1);
        return List.of(singleChoiceAnswer1);
    }

    public static List<ScoreHelper> getTutoringYears2() {
        TutoringYearsScoreHelper singleChoiceAnswer1 = new TutoringYearsScoreHelper();
        singleChoiceAnswer1.setValue(2);
        return List.of(singleChoiceAnswer1);
    }

    public static List<ScoreHelper> getTutoringYears3() {
        TutoringYearsScoreHelper singleChoiceAnswer1 = new TutoringYearsScoreHelper();
        singleChoiceAnswer1.setValue(3);
        return List.of(singleChoiceAnswer1);
    }

    public static List<ScoreHelper> getTutoringYears10() {
        TutoringYearsScoreHelper singleChoiceAnswer1 = new TutoringYearsScoreHelper();
        singleChoiceAnswer1.setValue(10);
        return List.of(singleChoiceAnswer1);
    }
}
