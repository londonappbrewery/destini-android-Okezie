package com.londonappbrewery.destini;

public class Questions {

    private int mQuestionID;

    public Questions(int questionResourceID){
        mQuestionID = questionResourceID;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }
}
