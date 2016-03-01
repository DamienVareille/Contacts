package com.example.j.tp2_adapteur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by J on 03/02/2016.
 */
public class ContactAdapter extends ArrayAdapter<Contact> {

    private LayoutInflater inflater;
    private int layout;

    public ContactAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);

        inflater = LayoutInflater.from(context);
        layout = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Contact element = getItem(position);

        ViewHolder holder;

        if (convertView == null) {

            convertView = inflater.inflate(layout, parent, false);

            holder = new ViewHolder();

            holder.emplacement = (TextView) convertView.findViewById(R.id.texte);
            holder.image = (ImageView) convertView.findViewById(R.id.photo);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.emplacement.setText(element.getNom());


        return convertView;
    }

    static class ViewHolder {
        TextView emplacement;
        ImageView image;
    }
}
