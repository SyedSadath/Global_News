package com.syedsadath.navigation_drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import static com.syedsadath.navigation_drawer.content_downloader.MArticleImgUrl;
import static com.syedsadath.navigation_drawer.content_downloader.MArticleTitle;

public class Head_Lines extends Fragment {

    GridView gridView ;
    String UrlRecived;

    public void reciveUrl(String url){

        UrlRecived = url;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



            content_downloader contentDownloader = new content_downloader();

            contentDownloader.json_parsin(UrlRecived);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View  view = inflater.inflate(R.layout.fragment_head__lines, container, false);

        gridView = (GridView) view.findViewById(R.id.gridview);

        GridImage adapter = new GridImage(Head_Lines.this.getActivity(),MArticleImgUrl,MArticleTitle);

        gridView.setAdapter(adapter);

        return view;
    }
}



