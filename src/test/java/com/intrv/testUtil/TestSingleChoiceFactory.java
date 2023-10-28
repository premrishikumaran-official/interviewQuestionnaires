package com.intrv.testUtil;


import com.intrv.helper.ScoreHelper;
import com.intrv.helper.TutoringYearsHelper;

import java.util.List;

public class TestSingleChoiceFactory {

    public static List<ScoreHelper> getTutoringYears1() {
        TutoringYearsHelper singleChoiceAnswer1 = new TutoringYearsHelper();
        singleChoiceAnswer1.setValue(1);
        return List.of(singleChoiceAnswer1);
    }

    public static List<ScoreHelper> getTutoringYears2() {
        TutoringYearsHelper singleChoiceAnswer1 = new TutoringYearsHelper();
        singleChoiceAnswer1.setValue(2);
        return List.of(singleChoiceAnswer1);
    }

    public static List<ScoreHelper> getTutoringYears3() {
        TutoringYearsHelper singleChoiceAnswer1 = new TutoringYearsHelper();
        singleChoiceAnswer1.setValue(3);
        return List.of(singleChoiceAnswer1);
    }

    public static List<ScoreHelper> getTutoringYears10() {
        TutoringYearsHelper singleChoiceAnswer1 = new TutoringYearsHelper();
        singleChoiceAnswer1.setValue(10);
        return List.of(singleChoiceAnswer1);
    }
}
