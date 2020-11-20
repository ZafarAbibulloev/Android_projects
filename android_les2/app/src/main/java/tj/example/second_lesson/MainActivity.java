package tj.example.second_lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    ImageView imageView2;
    private int counter = 0;

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView  = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageViwe);
        imageView2 =findViewById(R.id.imageViwe2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter+1;
                textView.setText(String.valueOf(counter));
            }

        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if(counter>0) {
                      counter = counter - 1;
                  }else {
                      counter = 0;
                  }  textView.setText(String.valueOf(counter));

            }
        });

    }
}
