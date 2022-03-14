package com.example.tuan4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterHangDIenTu extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<HangDienTu> arr;

    public AdapterHangDIenTu(Context context, int layout, ArrayList<HangDienTu> arr) {
        this.context = context;
        this.layout = layout;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        HangDienTu hangDienTu = arr.get(i);

        TextView tv1 = view.findViewById(R.id.name);
        TextView tv2 = view.findViewById(R.id.price);
        TextView tv3 = view.findViewById(R.id.numRate);
        TextView tv4 = view.findViewById(R.id.pricePercentSale);
        ImageView img = view.findViewById(R.id.imageHinh);
        RatingBar rtb = view.findViewById(R.id.rate);

        tv1.setText(hangDienTu.getName());
        tv2.setText(hangDienTu.getNewPrice());
        tv3.setText(hangDienTu.getPeopleRate());
        tv4.setText(hangDienTu.getReducePercent());
        img.setImageResource(hangDienTu.getImageThing());
        rtb.setRating(hangDienTu.getRate());

        return view;
    }
}
