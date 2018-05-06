package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mQuestionView;
    Button mTopButton;
    Button mBottomButton;
    int mStory;
    int mIndex;
    int mTrackQuestion;
    int mTrackQuestion2;

    // Create question array

    private Questions[] mQuestionsAndAnswers = new Questions[] {
            new Questions(R.string.T1_Story),
            new Questions(R.string.T1_Ans1),
            new Questions(R.string.T1_Ans2),
            new Questions(R.string.T2_Story),
            new Questions(R.string.T2_Ans1),
            new Questions(R.string.T2_Ans2),
            new Questions(R.string.T3_Story),
            new Questions(R.string.T3_Ans1),
            new Questions(R.string.T3_Ans2),
            new Questions(R.string.T4_End),
            new Questions(R.string.T5_End),
            new Questions(R.string.T6_End)
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mQuestionView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mStory = mQuestionsAndAnswers[mIndex].getQuestionID();



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topButtonQuestions();

            }
        });






        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("destini", "Bottom button clicked");
                bottomButtonQuestions();

            }
        });




    }

    private void topButtonQuestions(){
        mTrackQuestion = ++mTrackQuestion;
        //Log.d("destini", "Questions number" + mTrackQuestion);
        if(mTrackQuestion == 1){
            mIndex = 6;
            //Log.d("Dicee", "first mIndex value is : " + mIndex);
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mQuestionView.setText(mStory);
            mIndex = 7;
            //Log.d("Dicee", "Second mIndex value is : " + mIndex);
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mTopButton.setText(mStory);
            mIndex = 8;
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mBottomButton.setText(mStory);
        }else{
            mIndex = 11;
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mQuestionView.setText(mStory);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }


    }

    private void bottomButtonQuestions(){
        mTrackQuestion2 = ++mTrackQuestion2;
        if(mIndex == 8){
            mIndex = 10;
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mQuestionView.setText(mStory);
        }else if(mTrackQuestion2 == 1){
            mIndex = 3;
            //Log.d("Dicee", "first mIndex value is : " + mIndex);
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mQuestionView.setText(mStory);
            mIndex = 4;
            //Log.d("Dicee", "Second mIndex value is : " + mIndex);
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mTopButton.setText(mStory);
            mIndex = 5;
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mBottomButton.setText(mStory);
        }else{
            mIndex = 9;
            //Log.d("Dicee", "first mIndex value is : " + mIndex);
            mStory = mQuestionsAndAnswers[mIndex].getQuestionID();
            mQuestionView.setText(mStory);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }

    }
}
