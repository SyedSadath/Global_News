package com.syedsadath.navigation_drawer;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class content_downloader extends AppCompatActivity {

    JSONObject NewsObject;
    String articles;
    JSONArray ArticlesArray;
    JSONObject SingleArticleObject;
    String SingleArticle;

    static String url;
    static int noOfArticles;
    static int i;

    static Map<Integer, String> MArticleTitle = new HashMap<Integer, String>();
    static Map<Integer, String> MArticleImgUrl = new HashMap<Integer, String>();
    static ArrayList<String> AArticleUrls = new ArrayList<>();

    NewsDownloadTask task = new NewsDownloadTask();

    // try and catch method ↓↓

    public void json_parsin(String url) {

      this.url  = url;

        try{

        String results = task.execute(url).get();

        NewsObject = new JSONObject(results);

        articles = NewsObject.getString("articles");

        ArticlesArray = new JSONArray(articles);

        noOfArticles = ArticlesArray.length();

            for (i = 0; i < ArticlesArray.length(); i++) {

                SingleArticle = ArticlesArray.getString(i);

                SingleArticleObject = new JSONObject(SingleArticle);

                String Article_titles = SingleArticleObject.getString("title");

                String Article_url = SingleArticleObject.getString("url");

                String Article_img_url = SingleArticleObject.getString("urlToImage");

                MArticleTitle.put(i, Article_titles);
                MArticleImgUrl.put(i, Article_img_url);
                AArticleUrls.add(Article_url);

                Log.i("articles " , AArticleUrls.get(i));
            }
           }     catch (Exception e){
               e.printStackTrace();
        }
    }
}


