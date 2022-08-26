package uz.exemple.less7_task5_java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        String text = "I would #like to do #something similar to the #Twitter app";

        TextView tv = findViewById(R.id.textView);


        Spannable textSpan = new SpannableString(text);

        for (int i =0;i< text.length();i++){
            if(text.toCharArray()[i] == '#'){
                for (int j = i;j<text.length();j++){
                    if(text.toCharArray()[j] == ' ' || text.toCharArray()[j] == '.' || text.toCharArray()[j] == ','|| text.toCharArray()[j] == '-'){
                        textSpan.setSpan(new ForegroundColorSpan(Color.GREEN),i,j, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        break;
                    }
                }
            }
        }
        tv.setText(textSpan);
    }
}