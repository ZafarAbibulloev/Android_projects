package tj.example.second_lesson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button button;
    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageViwe);
        button = findViewById(R.id.button);

        //textView.setText(String.valueOf(counter));



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter =counter+1;
                textView.setText(String.valueOf(counter));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                intent.putExtra("counter", counter);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int result = data.getIntExtra("second_counter",0);
        textView.setText(String.valueOf(result));
        counter=result;

    }
}
