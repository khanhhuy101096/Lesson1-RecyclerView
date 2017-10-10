package com.example.khanhhuy.lesson_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerContact;
    private RecyclerView.LayoutManager mLayoutManager;
    private ContactAdapter mAdapter;
    private List<Contact> mContacts;//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerContact = (RecyclerView) findViewById(R.id.recycler_contact);
        mContacts = new ArrayList<>();
        getData();
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerContact.setLayoutManager(mLayoutManager);
        mAdapter = new ContactAdapter(mContacts);
        mRecyclerContact.setAdapter(mAdapter);

    }

    public List<Contact> getData() {
        mContacts.add(new Contact(1,"Huy","0165833107"));
        mContacts.add(new Contact(2,"Hiếu","0165833107"));
        mContacts.add(new Contact(3,"Quý","0165833107"));
        mContacts.add(new Contact(4,"Cương","0165833107"));
        mContacts.add(new Contact(5,"Lập","0165833107"));
        mContacts.add(new Contact(6,"Văn","0165833107"));
        mContacts.add(new Contact(7,"Bảo","0165833107"));

        return mContacts;
    }

}
