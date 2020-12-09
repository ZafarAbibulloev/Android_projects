package tj.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.telecom.Call;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements ContactAdapter.OnClickContactViewHolder {

    FloatingActionButton fab;
    RecyclerView recyclerView;
    ContactAdapter adapter;
    ContactsData[] contactsData = new ContactsData[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);

            }
        });
        
        ContactArray();


        RecView();



    }

    private void ContactArray() {

        contactsData[0] = new ContactsData(1,"Зафар", "Абибуллоев","myEmail@google.com","555-55-555");
        contactsData[1] = new ContactsData(2,"Мунтасир", "Хасанов","myEmail1@google.com","555-55-550");
        contactsData[2] = new ContactsData(3,"Нигина", "Ёрова","myEmail2@google.com","555-55-551");
        contactsData[3] = new ContactsData(4,"Чак", "Норис","myEmail3@google.com","555-55-552");
        contactsData[4] = new ContactsData(5,"Джеки", "Чан","myEmail4@google.com","555-55-553");
        contactsData[5] = new ContactsData(6,"Том", "Круз","myEmail5@google.com","555-55-554");
        contactsData[6] = new ContactsData(7,"Бред", "Питт","myEmail6@google.com","555-55-556");
        contactsData[7] = new ContactsData(8,"Джет", "Ли","myEmail@7google.com","555-55-557");
        contactsData[8] = new ContactsData(9,"Скарлет", "Йохансон","myEmail@8google.com","555-55-558");
        contactsData[9] = new ContactsData(10,"Дольф", "Лундгрен","myEmail@9google.com","555-55-559");
    }

    private void RecView() {

        recyclerView = findViewById(R.id.recView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,linearLayoutManager.getOrientation());
        adapter = new ContactAdapter(contactsData, this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

    }

    @Override
    public void OnClik(int position) {

        Intent intent =new Intent(getApplicationContext(),ContactActivity.class);
             intent.putExtra("name",contactsData[position].getName() + " " + contactsData[position].getLastname());
             intent.putExtra("email", contactsData[position].getEmail());
             intent.putExtra("phone", contactsData[position].getPhone());

        startActivity(intent);

    }
}