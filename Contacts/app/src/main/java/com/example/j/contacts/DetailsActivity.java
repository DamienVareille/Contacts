package com.example.j.tp2_adapteur;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by J on 29/02/2016.
 */
public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*

        // Ma liste d'éléments
        //elements = new ArrayList<>();

        // Mon Adapter
       // adapter = new ContactAdapter(this, R.layout.layout_string_image, elements);

        // Faire le lien
        //listView.setAdapter(adapter);


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
        //    elements.add(new Contact(name, null, photo));
        }

        // ajout d'un élément dans la liste d'éléments
        FloatingActionButton add = (FloatingActionButton) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    elements.add(new Contact("Jean", "0643719276", null));
            //    adapter.notifyDataSetChanged();

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
        });*/
    }
}
