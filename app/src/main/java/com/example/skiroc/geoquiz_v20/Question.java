package com.example.skiroc.geoquiz_v20;

/**
 * Created by skiroc on 1/12/17.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    /**
     * Getters and Setters
     */
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    /**
     * Constructor
     * @param textResId
     * @param isAnswerTrue
     */
    public Question(int textResId, boolean isAnswerTrue) {
        mTextResId = textResId;
        mAnswerTrue = isAnswerTrue;
    }
}
