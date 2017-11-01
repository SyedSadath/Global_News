package com.syedsadath.navigation_drawer;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.GridView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by syed sadath on 10/31/2017.
 */

public class content_downloader {

    String url;

    public void content_downloader(String url) {
        this.url = url;
    }

    GridView gridView ;

    Map<Integer, String> MArticleTitle  =  new HashMap<Integer, String>();
    Map<Integer, String> MArticleImgUrl =  new HashMap<Integer, String>();

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    JSONObject NewsObject;
    String articles;
    JSONArray ArticlesArray;
    JSONObject SingleArticleObject;
    String SingleArticle;

    int i;

    ArrayList<String> AArticleUrls = new ArrayList<>();


    NewsDownloadTask task = new NewsDownloadTask();


/*
    // try and catch method ↓↓

       try{
        //String results = task.execute(url).get();

        NewsObject = new JSONObject(results);

        articles = NewsObject.getString("articles");

        ArticlesArray = new JSONArray(articles);

        for (i = 0; i < ArticlesArray.length(); i++) {

            SingleArticle = ArticlesArray.getString(i);

            SingleArticleObject = new JSONObject(SingleArticle);

            String Article_titles = SingleArticleObject.getString("title");

            String Article_url = SingleArticleObject.getString("url");

            String Article_img_url = SingleArticleObject.getString("urlToImage");

            MArticleTitle.put(i, Article_titles);
            MArticleImgUrl.put(i, Article_img_url);
            AArticleUrls.add(Article_url);

            Log.i("Articles_Working_fine", AArticleUrls.get(i));

        }
    } catch (JSONException e) {
        e.printStackTrace();
    }
*/


//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    public  class NewsDownloadTask extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... urls) {




            String result = "";
            URL url;
            HttpURLConnection urlConnection = null;

            try {

                url = new URL(urls[0]);

                urlConnection = (HttpURLConnection) url.openConnection();

                InputStream in = urlConnection.getInputStream();

                InputStreamReader inputStreamReaderreader = new InputStreamReader(in);

                int data = inputStreamReaderreader.read();

                while (data != -1) {

                    char current = (char) data;
                    result += current;

                    data = inputStreamReaderreader.read();
                }


            } catch (Exception e) {

                e.printStackTrace();
            }


            return result;
        }

    }

}








