package tj.example.mycontacts;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    TextView textView;
    TextView Email;
    TextView PhoneNum;
    ImageView imageView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        Email = findViewById(R.id.Email);
        PhoneNum=findViewById(R.id.phoneNumber);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("name"));
        Email.setText(intent.getStringExtra("email"));
        PhoneNum.setText(intent.getStringExtra("phone"));





    }
}


