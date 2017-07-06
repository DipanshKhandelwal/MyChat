package com.example.dipanshkhandelwal.mychat;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by DIPANSH KHANDELWAL on 11-04-2017.
 */

public class MessageAdapter extends ArrayAdapter<MyMessage> {
    public MessageAdapter(Context context, int resource , List<MyMessage> objects){
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.messagelayout, parent, false);
        }

        LinearLayout messageL = (LinearLayout) convertView.findViewById(R.id.message);
        ImageView image_xml = (ImageView) convertView.findViewById(R.id.image_xml);
        ImageView dp_xml = (ImageView) convertView.findViewById(R.id.dp_xml);
        TextView text_xml = (TextView) convertView.findViewById(R.id.text_xml);
        TextView date_xml = (TextView) convertView.findViewById(R.id.date_xml);
        TextView name_xml = (TextView) convertView.findViewById(R.id.name_xml);

        MyMessage message = getItem(position);

        if(position%2==0){
            messageL.setBackgroundColor(Color.parseColor("#add7e4"));
        }else{
            messageL.setBackgroundColor(Color.parseColor("#6999a7"));
        }

       boolean isPhoto = message.getPhotoUrl() != null ;

        if (isPhoto){

            text_xml.setVisibility(View.VISIBLE);
            text_xml.setText("Photo . . . ");

            image_xml.setVisibility(View.VISIBLE);
            Glide.with(image_xml.getContext())
                    .load(message.getPhotoUrl())
                    .into(image_xml);

        }else {
            image_xml.setVisibility(View.GONE);
            text_xml.setVisibility(View.VISIBLE);
            text_xml.setText(message.getText());
        }


        date_xml.setText(message.getTime());

        Glide.with(dp_xml.getContext())
                .load(message.getDpUrl())
                .into(dp_xml);

        name_xml.setText(message.getName());

        return convertView;
    }
}
