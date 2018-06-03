package com.syedsadath.navigation_drawer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
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
    private Map<Integer, String> LocalMArticleTitleS;
    private Map<Integer, String> LocalMArticlesUrl;

    public static int getImageWidth() {
        return ((Resources.getSystem().getDisplayMetrics().widthPixels / 2) - 2);
    }

    public static int getImageHeight() {
        return ((Resources.getSystem().getDisplayMetrics().heightPixels - 100)/3 );
    }


    public GridImage(Context context, Map<Integer, String> MArticleImagesURLS,Map<Integer, String> MArticleTITLEs , Map<Integer, String> MArticlesURL){

        this.context = context;
        this.LocalMArticleImages = MArticleImagesURLS;
        this.LocalMArticleTitleS = MArticleTITLEs;
        this.LocalMArticlesUrl = MArticlesURL;
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if (gridView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.single_item, parent, false);
        }


        ImageView img = (ImageView) gridView.findViewById(R.id.imageView);
        //img.setScaleX(getImageWidth());
        //img.setScaleY(getImageHeight());

        String temp = LocalMArticleImages.get(position);

        Picasso.with(context).load(temp)
                .resize(getImageWidth(), getImageHeight())
                .centerCrop()
                .into(img);

        String title = getTITle(position);
        TextView Title = (TextView) gridView.findViewById(R.id.title);

        Title.setHeight(getImageHeight() / 4);
        Title.setWidth(getImageWidth());
        Title.setText(title);

       //-------------------------------------------------------------------------------------------------------------

        final View selectedItem = gridView;

        selectedItem.setId(position);
        gridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = selectedItem.getId();

                Log.i("Clicked_itemIS",String.valueOf(id));


                String URLclicked = LocalMArticlesUrl.get(id);

                Log.i("Clicked_tpoicIS", String.valueOf( LocalMArticleTitleS.get(id)));
                Log.i("Clicked_URL" , URLclicked);



              //--------------------------------------------------------------------------------------------

                Intent intent = new Intent(context, Article_view.class);

                intent.putExtra("Article_url", URLclicked);

                context.startActivity(intent);


              //--------------------------------------------------------------------------------------------

            }
        });

        return gridView;
    }
}

