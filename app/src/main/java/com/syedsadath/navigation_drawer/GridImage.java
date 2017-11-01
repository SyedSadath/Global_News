package com.syedsadath.navigation_drawer;

/**
 * Created by syed sadath on 10/27/2017.
 */

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Map;



/**
 * Created by syed sadath on 9/19/2017.
 */

public class GridImage extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private Map<Integer, String> LocalMArticleImages;
    private  Map<Integer, String> LocalMArticleTitleS;

    public static int getImageWidth() {
        return ((Resources.getSystem().getDisplayMetrics().widthPixels / 2) - 2);
    }

    public static int getImageHeight() {
        return ((Resources.getSystem().getDisplayMetrics().heightPixels - 100)/3 );
    }


    public GridImage(Context context, Map<Integer, String> MArticleImagesURLS,Map<Integer, String> MArticleTITLEs ){

        this.context = context;
        this.LocalMArticleImages = MArticleImagesURLS;
        this.LocalMArticleTitleS = MArticleTITLEs;
    }

    @Override
    public int getCount() {
        return LocalMArticleImages.size();
    }

    @Override
    public Object getItem(int position) {

        return LocalMArticleImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    public  String getTITle(int position){
        return  LocalMArticleTitleS.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if(gridView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.single_item,parent,false);
        }

        ImageView img = (ImageView) gridView.findViewById(R.id.imageView);
        //img.setScaleX(getImageWidth());
        //img.setScaleY(getImageHeight());

        String temp = LocalMArticleImages.get(position);

        Picasso.with(context).load(temp)
                .resize(getImageWidth(),getImageHeight())
                .centerCrop()
                .into(img);

        String title = getTITle(position);
        TextView Title = (TextView) gridView.findViewById(R.id.title);

        Title.setHeight(getImageHeight()/4);
        Title.setWidth(getImageWidth());
        Title.setText(title);

        Log.i("TItle Height", String.valueOf(getImageHeight()/6));

        return gridView;

    }



}

