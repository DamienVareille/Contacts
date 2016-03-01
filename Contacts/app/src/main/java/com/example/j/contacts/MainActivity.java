package com.example.j.tp2_adapteur;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> elements;

    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        // Ma ListView
        ListView listView = (ListView) findViewById(R.id.list);

        // Ma liste d'éléments
        elements = new ArrayList<>();

        // Mon Adapter
        adapter = new ContactAdapter(this, R.layout.layout_string_image, elements);

        // Faire le lien
        listView.setAdapter(adapter);


        String[] projection = {
                ContactsContract.Contacts._ID,
                ContactsContract.Contacts.LOOKUP_KEY,
                ContactsContract.Contacts.DISPLAY_NAME_PRIMARY,
                ContactsContract.Contacts.PHOTO_ID,
                ContactsContract.Contacts.PHOTO_THUMBNAIL_URI
        };

        String selection = ContactsContract.Contacts.HAS_PHONE_NUMBER + " = '1'";

        String orderBy = ContactsContract.Contacts.DISPLAY_NAME_PRIMARY + " ASC";

        Cursor cursor = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, projection, selection, null, orderBy);

        int nameColumn = cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME_PRIMARY);
        int photoColumn = cursor.getColumnIndex(ContactsContract.Contacts.PHOTO_THUMBNAIL_URI);

        while (cursor.moveToNext())
        {
            String name = cursor.getString(nameColumn);
            String photo = cursor.getString(photoColumn);
            elements.add(new Contact(name, null, photo));
            adapter.notifyDataSetChanged();
        }

        // ajout d'un élément dans la liste d'éléments
        FloatingActionButton add = (FloatingActionButton) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elements.add(new Contact("Jean", "0643719276", null));
                adapter.notifyDataSetChanged();

            }
        });

        // Gérer le clic
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // on récupère l'élément sur lequel on a cliqué


                Intent i = new Intent(getApplicationContext(), DetailsActivity.class);
                i.putExtra("nom", "testNom");
                i.putExtra("numero","testNum");
                i.putExtra("photo", "testphoto");
                getApplicationContext().startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
