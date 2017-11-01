package com.syedsadath.navigation_drawer;

import android.os.AsyncTask;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by syed sadath on 10/31/2017.
 */

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

