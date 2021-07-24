package com.thienthai.listviewnangcao;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class  TraiCayAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    //tap class Hoder
    private class viewHolder{
        TextView txtTen, txtDes;
        ImageView hinhAnh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder holder;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);

            holder = new viewHolder();
            //anhSa
            holder.txtDes = (TextView) convertView.findViewById(R.id.textViewTen);
            holder.txtTen = (TextView) convertView.findViewById(R.id.textViewDes);
            holder.hinhAnh = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(holder);
        }else {
            holder = (viewHolder) convertView.getTag();
        }

        //gáng giá trị.
        TraiCay traiCay = traiCayList.get(position);
        holder.txtTen.setText(traiCay.getTen());
        holder.txtDes.setText(traiCay.getMoTa());
        holder.hinhAnh.setImageResource(traiCay.getHinh());

        return convertView;
    }
}
