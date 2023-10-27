package com.intrv.util;


import com.intrv.singlechoice.SingleChoiceAnswer;

import java.util.List;

public class TestSingleChoiceFactory {

    public static List<SingleChoiceAnswer> getSingleChoiceAnswerList() {
        SingleChoiceAnswer singleChoiceAnswer1 = () -> 1;
        SingleChoiceAnswer singleChoiceAnswer2 = () -> 1;
        SingleChoiceAnswer singleChoiceAnswer3 = () -> 1;
        return List.of(singleChoiceAnswer1,singleChoiceAnswer2,singleChoiceAnswer3);
    }
}
