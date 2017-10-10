package com.example.khanhhuy.lesson_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by yeu_thuong on 10/9/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private List<Contact> mContacts;
    private LayoutInflater mLayoutInflater;

    public ContactAdapter(List<Contact> contacts){
        mContacts = contacts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public  RecyclerView mRecyclerView;
        public TextView mTextName;
        private TextView mTextPhone;
        public ViewHolder(View view) {
            super(view);
            mTextName = view.findViewById(R.id.text_name);
            mTextPhone = view.findViewById(R.id.text_phone);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextName.setText(mContacts.get(position).getName());
        holder.mTextPhone.setText(mContacts.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
