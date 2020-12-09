package tj.example.second_lesson;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Second_Activity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button button;
    int counter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageViwe2);
        button = findViewById(R.id.button2);

        final Intent intent = getIntent();
        counter = intent.getIntExtra("counter",0);
        textView.setText(String.valueOf(intent.getIntExtra("counter",0)));


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter>0){
                    counter = counter-1;
                }else {
                    counter=0;
                }textView.setText(String.valueOf(counter));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =getIntent();
                intent.putExtra("second_counter",counter);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }


}
