package ru.ivt5.school;

public enum TrainingErrorCode {
    TRAINEE_WRONG_RATING("wrong raiting"),
    TRAINEE_WRONG_LASTNAME("wrong lastName"),
    TRAINEE_WRONG_FIRSTNAME("wrong firstName"),
    TRAINEE_NOT_FOUND("trainee not found"),
    GROUP_WRONG_ROOM("wrong room number"),
    GROUP_WRONG_NAME("wrong name"),
    SCHOOL_WRONG_NAME("wrong school name"),
    DUPLICATE_GROUP_NAME("wrong group name , duplicated name"),
    GROUP_NOT_FOUND("group not found"),
    DUPLICATE_TRAINEE("duplicated trainee"),
    EMPTY_TRAINEE_QUEUE("wrong trainee");
    String errorString;

    TrainingErrorCode(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return errorString;
    }
}