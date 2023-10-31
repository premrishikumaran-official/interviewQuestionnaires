package com.intrv.model;

public class TutorQuestionnaire {

    private String tutorId;

    private MultipleSelect multipleSelect;
    private SingleSelect singleSelect;

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public MultipleSelect getMultipleSelect() {
        return multipleSelect;
    }

    public void setMultipleSelect(MultipleSelect multipleSelect) {
        this.multipleSelect = multipleSelect;
    }

    public SingleSelect getSingleSelect() {
        return singleSelect;
    }

    public void setSingleSelect(SingleSelect singleSelect) {
        this.singleSelect = singleSelect;
    }
}
