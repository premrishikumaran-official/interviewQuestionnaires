package com.intrv.testUtil;


import com.intrv.model.singlechoice.SingleChoiceAnswer;
import com.intrv.model.singlechoice.TutoringYears;

import java.util.List;

public class TestSingleChoiceFactory {

    public static List<SingleChoiceAnswer> getTutoringYears1() {
        SingleChoiceAnswer singleChoiceAnswer1 = new TutoringYears();
        singleChoiceAnswer1.setValue(1);
        return List.of(singleChoiceAnswer1);
    }

    public static List<SingleChoiceAnswer> getTutoringYears2() {
        SingleChoiceAnswer singleChoiceAnswer1 = new TutoringYears();
        singleChoiceAnswer1.setValue(2);
        return List.of(singleChoiceAnswer1);
    }

    public static List<SingleChoiceAnswer> getTutoringYears3() {
        SingleChoiceAnswer singleChoiceAnswer1 = new TutoringYears();
        singleChoiceAnswer1.setValue(3);
        return List.of(singleChoiceAnswer1);
    }

    public static List<SingleChoiceAnswer> getTutoringYears10() {
        SingleChoiceAnswer singleChoiceAnswer1 = new TutoringYears();
        singleChoiceAnswer1.setValue(10);
        return List.of(singleChoiceAnswer1);
    }
}
