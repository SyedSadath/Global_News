package com.syedsadath.navigation_drawer;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class Head_Lines extends Fragment {

    GridView gridView ;


    Map<Integer, String> MArticleTitle  =  new HashMap<Integer, String>();
    Map<Integer, String> MArticleImgUrl =  new HashMap<Integer, String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String url = "https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=cb439410afcb4ef69b20154803ae69ba";

        content_downloader contentDownloader = new content_downloader();

        contentDownloader.content_downloader(url);
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



