package com.syedsadath.navigation_drawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.GridView;


import static com.syedsadath.navigation_drawer.content_downloader.MArticleUrls;
import static com.syedsadath.navigation_drawer.content_downloader.MArticleImgUrl;
import static com.syedsadath.navigation_drawer.content_downloader.MArticleTitle;

public class GetNews extends Fragment {

    static GridView gridView;
    String UrlRecived;


    public void reciveUrl(String url) {

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

        View view = inflater.inflate(R.layout.fragment_head__lines, container, false);

        gridView = (GridView) view.findViewById(R.id.gridview);

        GridImage adapter = new GridImage(GetNews.this.getActivity(), MArticleImgUrl, MArticleTitle,MArticleUrls);

        gridView.setAdapter(adapter);

        return view;
    }

}



