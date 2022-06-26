package com.example.myfirstapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FieldsAdapter extends RecyclerView.Adapter<FieldsAdapter.ViewHolderFields> {

    ArrayList<Fields> fieldList;

    public FieldsAdapter(ArrayList<Fields> fieldList) {
        this.fieldList = fieldList;
    }


    @NonNull
    @Override
    public ViewHolderFields onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderFields(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFields holder, int position) {

    }

    @Override
    public int getItemCount() {
        return fieldList.size();
    }

    public class ViewHolderFields extends RecyclerView.ViewHolder {

        TextView nameId, idDescription;
        ImageView imgId;

        public ViewHolderFields(@NonNull View itemView) {
            super(itemView);

            nameId = itemView.findViewById(R.id.nameId);
            idDescription = itemView.findViewById(R.id.idDescription);
            imgId = itemView.findViewById(R.id.imgId);
        }
    }
}
