package com.syedsadath.navigation_drawer;

import android.os.Bundle;

import android.support.v4.app.FragmentManager;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GetNews getNews = new GetNews();
        FragmentManager manager = getSupportFragmentManager();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("Head Lines");

        TextView title = (TextView) toolbar.findViewById(R.id.toolbar_title);
        title.setText("HeadLines");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
         toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        String headlines = "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=cb439410afcb4ef69b20154803ae69ba";
        getNews.reciveUrl(headlines);
        manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout  drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automaticlly handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager manager = getSupportFragmentManager();
        GetNews getNews = new GetNews();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView title = (TextView) toolbar.findViewById(R.id.toolbar_title);


/*#####################------------------------------------------------>>>>>>>>>  GENERAL NEWS  <<<<<<<<<------------------------------------------------#####################*/


        if (id == R.id.ABC_News) {

            title.setText("ABC News");


            String ABC_News = "https://newsapi.org/v2/top-headlines?sources=abc-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(ABC_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.ABC_News_AU) {

            title.setText("ABC News (AU)");


            String ABC_News_AU ="https://newsapi.org/v2/top-headlines?sources=abc-news-au&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(ABC_News_AU);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Aftenposten) {

            title.setText("Aftenposten");


            String Aftenposten ="https://newsapi.org/v2/top-headlines?sources=aftenposten&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Aftenposten);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Al_Jazeera_English) {

            title.setText("Al Jazeera English");


            String Al_Jazeera_English ="https://newsapi.org/v2/top-headlines?sources=aftenposten&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Al_Jazeera_English);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        } else if (id == R.id.ANSA_it) {

            title.setText("ANSA.it");


            String ANSAit ="https://newsapi.org/v2/top-headlines?sources=ansa&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(ANSAit);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Ary_News) {

            title.setText("Ary News");


            String Ary_News="https://newsapi.org/v2/top-headlines?sources=ary-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Ary_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Associated_Press) {

            title.setText("Associated Press");


            String Associated_Press = "https://newsapi.org/v2/top-headlines?sources=associated-press&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Associated_Press);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Axios) {

            title.setText("Axios");


            String Axios ="https://newsapi.org/v2/top-headlines?sources=axios&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Axios);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.BBC_News) {

            title.setText("BBC News");


            String BBC_News ="https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(BBC_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Bild) {

            title.setText("Bild");


            String Bild="https://newsapi.org/v2/top-headlines?sources=bild&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Bild);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Blasting_News) {

            title.setText("Blasting News");


            String Blasting_News ="https://newsapi.org/v2/top-headlines?sources=blasting-news-br&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Blasting_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.CBC_News) {

            title.setText("CBC News");


            String CBC_News="https://newsapi.org/v2/top-headlines?sources=cbc-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(CBC_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.CNN) {

            title.setText("CNN");


            String CNN ="https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(CNN);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.CNN_Spanish) {

            title.setText("CNN Spanish");


            String CNN_Spanish ="https://newsapi.org/v2/top-headlines?sources=cnn-es&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(CNN_Spanish);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();


         } else if (id == R.id.Der_Tagesspiegel) {

            title.setText("Der Tagesspiegel");


            String Der_Tagesspiegel="https://newsapi.org/v2/top-headlines?sources=der-tagesspiegel&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Der_Tagesspiegel);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.El_Mundo) {

            title.setText("El Mundo");


            String El_Mundo="https://newsapi.org/v2/top-headlines?sources=el-mundo&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(El_Mundo);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Focus) {

            title.setText("Focus");


            String Focus="https://newsapi.org/v2/top-headlines?sources=focus&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Focus);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Fox_News) {

            title.setText("Fox News");


            String Fox_News="https://newsapi.org/v2/top-headlines?sources=fox-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Fox_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Globo) {

            title.setText("Globo");


            String Globo="https://newsapi.org/v2/top-headlines?sources=globo&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Globo);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Göteborgs_Posten) {

            title.setText("Göteborgs Posten");


            String Göteborgs_Posten="https://newsapi.org/v2/top-headlines?sources=goteborgs-posten&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Göteborgs_Posten);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Independent) {

            title.setText("Independent");


            String Independent="https://newsapi.org/v2/top-headlines?sources=independent&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Independent);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Infobae) {

            title.setText("Infobae");


            String Infobae="https://newsapi.org/v2/top-headlines?sources=infobae&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Infobae);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.La_Gaceta) {

            title.setText("La Gaceta");


            String La_Gaceta="https://newsapi.org/v2/top-headlines?sources=la-gaceta&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(La_Gaceta);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.La_Repubblica) {

            title.setText("La Repubblica");


            String La_Repubblica="https://newsapi.org/v2/top-headlines?sources=la-repubblica&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(La_Repubblica);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Le_Monde) {

            title.setText("Le Monde");


            String Le_Monde="https://newsapi.org/v2/top-headlines?sources=le-monde&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Le_Monde);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Lenta) {

            title.setText("Lenta");


            String Lenta="https://newsapi.org/v2/top-headlines?sources=lenta&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Lenta);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Libération) {

            title.setText("Libération");


            String Libération="https://newsapi.org/v2/top-headlines?sources=liberation&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Libération);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Metro) {

            title.setText("Metro");


            String Metro="https://newsapi.org/v2/top-headlines?sources=metro&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Metro);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Mirror) {

            title.setText("Mirror");


            String Mirror="https://newsapi.org/v2/top-headlines?sources=mirror&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Mirror);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.MSNBC) {

            title.setText("MSNBC");


            String MSNBC="https://newsapi.org/v2/top-headlines?sources=msnbc&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(MSNBC);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.NBC_News) {

            title.setText("NBC News");


            String NBC_News="https://newsapi.org/v2/top-headlines?sources=nbc-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(NBC_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.News24) {

            title.setText("News24");


            String News24="https://newsapi.org/v2/top-headlines?sources=news24&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(News24);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.News_com_au) {

            title.setText("News.com.au");


            String News_com_au="https://newsapi.org/v2/top-headlines?sources=news-com-au&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(News_com_au);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Newsweek) {

            title.setText("Newsweek");


            String Newsweek="https://newsapi.org/v2/top-headlines?sources=newsweek&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Newsweek);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.New_York_Magazine) {

            title.setText("New York Magazine");


            String New_York_Magazine="https://newsapi.org/v2/top-headlines?sources=new-york-magazine&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(New_York_Magazine);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.NRK) {

            title.setText("NRK");


            String NRK="https://newsapi.org/v2/top-headlines?sources=nrk&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(NRK);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.RBC) {

            title.setText("RBC");


            String RBC="https://newsapi.org/v2/top-headlines?sources=rbc&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(RBC);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Reuters) {

            title.setText("Reuters");


            String Reuters="https://newsapi.org/v2/top-headlines?sources=reuters&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Reuters);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.RT) {

            title.setText("RT");


            String RT="https://newsapi.org/v2/top-headlines?sources=rt&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(RT);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.RTE) {

            title.setText("RTE");


            String RTE="https://newsapi.org/v2/top-headlines?sources=rte&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(RTE);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.RTL) {

            title.setText("RTL");


            String RTL="https://newsapi.org/v2/top-headlines?sources=rtl-nieuws&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(RTL);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.SABQ) {

            title.setText("SABQ");


            String SABQ="https://newsapi.org/v2/top-headlines?sources=sabq&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(SABQ);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Spiegel) {

            title.setText("Spiegel");


            String Spiegel="https://newsapi.org/v2/top-headlines?sources=spiegel-online&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Spiegel);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Svenska_Dagbladet) {

            title.setText("Svenska Dagbladet");


            String Svenska_Dagbladet="https://newsapi.org/v2/top-headlines?sources=svenska-dagbladet&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Svenska_Dagbladet);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Reddit) {

            title.setText("Reddit");


            String Reddit="https://newsapi.org/v2/top-headlines?sources=reddit-r-all&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Reddit);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Globe_And_Mail) {

            title.setText("The Globe And Mail");


            String The_Globe_And_Mail="https://newsapi.org/v2/top-headlines?sources=the-globe-and-mail&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Globe_And_Mail);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Guardian_AU) {

            title.setText("The Guardian (AU)");


            String The_Guardian_AU="https://newsapi.org/v2/top-headlines?sources=the-guardian-au&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Guardian_AU);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Guardian_UK) {

            title.setText("The Guardian (UK)");


            String The_Guardian_UK="https://newsapi.org/v2/top-headlines?sources=the-guardian-uk&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Guardian_UK);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Hindu) {

            title.setText("The Hindu");


            String The_Hindu="https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Hindu);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Huffington_Post) {

            title.setText("The Huffington Post");


            String The_Huffington_Post="https://newsapi.org/v2/top-headlines?sources=the-huffington-post&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Huffington_Post);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Irish_Times) {

            title.setText("The Irish Times");


            String The_Irish_Times="https://newsapi.org/v2/top-headlines?sources=the-irish-times&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Irish_Times);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_New_York_Times) {

            title.setText("The New York Times");


            String The_New_York_Times="https://newsapi.org/v2/top-headlines?sources=the-new-york-times&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_New_York_Times);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Times_of_India) {

            title.setText("The Times of India");


            String The_Times_of_India="https://newsapi.org/v2/top-headlines?sources=the-times-of-india&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Times_of_India);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Telegraph) {

            title.setText("The Telegraph");


            String The_Telegraph="https://newsapi.org/v2/top-headlines?sources=the-telegraph&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Telegraph);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.The_Washington) {

            title.setText("The Washington");


            String The_Washington="https://newsapi.org/v2/top-headlines?sources=the-washington-post&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Washington);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Time) {

            title.setText("Time general");


            String Time_general="https://newsapi.org/v2/top-headlines?sources=time&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Time_general);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.USA_Today) {

            title.setText("USA Today");


            String USA_Today="https://newsapi.org/v2/top-headlines?sources=usa-today&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(USA_Today);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Vice_News) {

            title.setText("Vice News");


            String Vice_News="https://newsapi.org/v2/top-headlines?sources=vice-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Vice_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Xinhua_Net) {

            title.setText("Xinhua Net");


            String Xinhua_Net="https://newsapi.org/v2/top-headlines?sources=xinhua-net&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Xinhua_Net);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout,getNews,getNews.getTag()).commit();

        } else if (id == R.id.Ynet) {

            title.setText("Ynet");


            String Ynet = "https://newsapi.org/v2/top-headlines?sources=ynet&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Ynet);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }


/*#####################------------------------------------------------>>>>>>>>>  BUSSINESS  <<<<<<<<<------------------------------------------------#####################*/


        else if (id == R.id.Argaam) {

            title.setText("Argaam");


            String  Argaam= "https://newsapi.org/v2/top-headlines?sources=argaam&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Argaam);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Australian_Financial_Review) {

            title.setText("Australian Financial Review");


            String  Australian_Financial_Review= "https://newsapi.org/v2/top-headlines?sources=australian-financial-review&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Australian_Financial_Review);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Bloomberg) {

            title.setText("Bloomberg");


            String  Bloomberg= "https://newsapi.org/v2/top-headlines?sources=bloomberg&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Bloomberg);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Business_Insider) {

            title.setText("Business Insider");


            String  Business_Insider= "https://newsapi.org/v2/top-headlines?sources=business-insider&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Business_Insider);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Business_Insider_UK) {

            title.setText("Business Insider (UK)");


            String  Business_Insider_UK= "https://newsapi.org/v2/top-headlines?sources=business-insider-uk&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Business_Insider_UK);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.CNBC) {

            title.setText("CNBC");


            String  CNBC= "https://newsapi.org/v2/top-headlines?sources=cnbc&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(CNBC);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Die_Zeit) {

            title.setText("Die Zeit");


            String  Die_Zeit= "https://newsapi.org/v2/top-headlines?sources=die-zeit&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Die_Zeit);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Financial_Post) {

            title.setText("Financial Post");


            String  Financial_Post= "https://newsapi.org/v2/top-headlines?sources=financial-post&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Financial_Post);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Financial_Times) {

            title.setText("Financial Times");


            String  Financial_Times= "https://newsapi.org/v2/top-headlines?sources=financial-times&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Financial_Times);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Fortune) {

            title.setText("Fortune");


            String  Fortune= "https://newsapi.org/v2/top-headlines?sources=fortune&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Fortune);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Handelsblatt) {

            title.setText("Handelsblatt");


            String  Handelsblatt= "https://newsapi.org/v2/top-headlines?sources=handelsblatt&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Handelsblatt);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Il_Sole_24_Ore) {

            title.setText("Il Sole 24 Ore");


            String  Il_Sole_24_Ore= "https://newsapi.org/v2/top-headlines?sources=il-sole-24-ore&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Il_Sole_24_Ore);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.InfoMoney) {

            title.setText("InfoMoney");


            String InfoMoney = "https://newsapi.org/v2/top-headlines?sources=info-money&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(InfoMoney);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Les_Echos) {

            title.setText("Les Echos");


            String Les_Echos = "https://newsapi.org/v2/top-headlines?sources=les-echos&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Les_Echos);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Economist) {

            title.setText("The Economist");


            String The_Economist = "https://newsapi.org/v2/top-headlines?sources=the-economist&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Economist);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Wall_Street_Journal) {

            title.setText("The Wall Street Journal");


            String The_Wall_Street_Journal = "https://newsapi.org/v2/top-headlines?sources=the-wall-street-journal&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Wall_Street_Journal);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Wirtschafts_Woche) {

            title.setText("Wirtschafts Woche");


            String Wirtschafts_Woche = "https://newsapi.org/v2/top-headlines?sources=wirtschafts-woche&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Wirtschafts_Woche);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }

/*#####################------------------------------------------------>>>>>>>>>  TECHNOLOGY  <<<<<<<<<------------------------------------------------#####################*/


        else if (id == R.id.Ars_Technica) {

            title.setText("Ars Technica");

            String  Ars_Technica= "https://newsapi.org/v2/top-headlines?sources=ars-technica&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Ars_Technica);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Crypto_Coins_News) {

            title.setText("Crypto Coins News");

            String Crypto_Coins_News = "https://newsapi.org/v2/top-headlines?sources=crypto-coins-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Crypto_Coins_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Engadget) {

            title.setText("Engadget");

            String  Engadget= "https://newsapi.org/v2/top-headlines?sources=engadget&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Engadget);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Gruenderszene) {

            title.setText("Gruenderszene");

            String Gruenderszene = "https://newsapi.org/v2/top-headlines?sources=gruenderszene&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Gruenderszene);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Hacker_News) {

            title.setText("Hacker_News");

            String Hacker_News = "https://newsapi.org/v2/top-headlines?sources=hacker-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Hacker_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Recode) {

            title.setText("Recode");

            String Recode = "https://newsapi.org/v2/top-headlines?sources=recode&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Recode);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.T3n) {

            title.setText("T3n");

            String T3n = "https://newsapi.org/v2/top-headlines?sources=t3n&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(T3n);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.TechCrunch) {

            title.setText("TechCrunch");

            String TechCrunch = "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(TechCrunch);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.TechCrunch_CN) {

            title.setText("TechCrunch (CN)");

            String TechCrunch_CN = "https://newsapi.org/v2/top-headlines?sources=techcrunch-cn&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(TechCrunch_CN);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.TechRadar) {

            title.setText("TechRadar");

            String TechRadar = "https://newsapi.org/v2/top-headlines?sources=techradar&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(TechRadar);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Next_Web) {

            title.setText("The Next Web");

            String The_Next_Web = "https://newsapi.org/v2/top-headlines?sources=the-next-web&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Next_Web);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Verge) {

            title.setText("The Verge");

            String The_Verge = "https://newsapi.org/v2/top-headlines?sources=the-verge&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Verge);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Wired_technology) {

            title.setText("Wired technology");

            String Wired_technology = "https://newsapi.org/v2/top-headlines?sources=wired&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Wired_technology);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Wired_de) {

            title.setText("Wired.de");

            String Wired_de = "https://newsapi.org/v2/top-headlines?sources=wired-de&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Wired_de);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }


/*#####################------------------------------------------------>>>>>>>>>  SPORTS  <<<<<<<<<------------------------------------------------#####################*/

        else if (id == R.id.BBC_Sport) {

            title.setText("BBC Sport");

            String BBC_Sport = "https://newsapi.org/v2/top-headlines?sources=bbc-sport&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(BBC_Sport);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Bleacher_Report) {

            title.setText("Bleacher Report");

            String Bleacher_Report = "https://newsapi.org/v2/top-headlines?sources=bleacher-report&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Bleacher_Report);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.ESPN) {

            title.setText("ESPN");

            String ESPN = "https://newsapi.org/v2/top-headlines?sources=espn&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(ESPN);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.ESPN_Cric_Info) {

            title.setText("ESPN Cric Info");

            String ESPN_Cric_Info = "https://newsapi.org/v2/top-headlines?sources=espn-cric-info&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(ESPN_Cric_Info);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Football_Italia) {

            title.setText("Football Italia");

            String Football_Italia = "https://newsapi.org/v2/top-headlines?sources=football-italia&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Football_Italia);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.FourFourTwo) {

            title.setText("FourFourTwo");

            String FourFourTwo = "https://newsapi.org/v2/top-headlines?sources=four-four-two&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(FourFourTwo);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Fox_Sports) {

            title.setText("Fox Sports");

            String Fox_Sports = "https://newsapi.org/v2/top-headlines?sources=fox-sports&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Fox_Sports);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.L_equipe) {

            title.setText("L'equipe");

            String L_equipe = "https://newsapi.org/v2/top-headlines?sources=lequipe&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(L_equipe);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Marca) {

            title.setText("Marca");

            String Marca = "https://newsapi.org/v2/top-headlines?sources=marca&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Marca);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.NFL_News) {

            title.setText("NFL News");

            String NFL_News = "https://newsapi.org/v2/top-headlines?sources=nfl-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(NFL_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.NHL_News) {

            title.setText("NHL News");

            String NHL_News = "https://newsapi.org/v2/top-headlines?sources=nhl-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(NHL_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.TalkSport) {

            title.setText("TalkSport");

            String TalkSport = "https://newsapi.org/v2/top-headlines?sources=talksport&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(TalkSport);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Sport_Bible) {

            title.setText("The Sport Bible");

            String The_Sport_Bible = "https://newsapi.org/v2/top-headlines?sources=the-sport-bible&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Sport_Bible);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }


/*#####################------------------------------------------------>>>>>>>>>  GOOGLE  <<<<<<<<<------------------------------------------------#####################*/


        else if (id == R.id.Google_News_general) {

            title.setText("Google News general");

            String Google_News_general  = "https://newsapi.org/v2/top-headlines?sources=google-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Google_News_general);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Argentina) {

            title.setText("Google News (Argentina)");

            String Argentina = "https://newsapi.org/v2/top-headlines?sources=google-news-ar&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Argentina);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Australia) {

            title.setText("Google News (Australia)");

            String Australia = "https://newsapi.org/v2/top-headlines?sources=google-news-au&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Australia);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Brasil) {

            title.setText("Google News (Brasil)");

            String Brasil = "https://newsapi.org/v2/top-headlines?sources=google-news-br&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Brasil);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Canada) {

            title.setText("Google News (Canada)");

            String Canada = "https://newsapi.org/v2/top-headlines?sources=google-news-ca&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Canada);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.France) {

            title.setText("Google News (France)");

            String France = "https://newsapi.org/v2/top-headlines?sources=google-news-fr&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(France);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.India) {

            title.setText("Google News (India)");

            String India = "https://newsapi.org/v2/top-headlines?sources=google-news-in&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(India);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Israel) {

            title.setText("Google News (Israel)");

            String Israel = "https://newsapi.org/v2/top-headlines?sources=google-news-is&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Israel);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Italy) {

            title.setText("Google News (Italy)");

            String Italy = "https://newsapi.org/v2/top-headlines?sources=google-news-it&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Italy);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Russia) {

            title.setText("Google News (Russia)");

            String Russia = "https://newsapi.org/v2/top-headlines?sources=google-news-ru&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Russia);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Saudi_Arabia) {

            title.setText("Google News (Saudi Arabia)");

            String Saudi_Arabia = "https://newsapi.org/v2/top-headlines?sources=google-news-sa&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Saudi_Arabia);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.UK) {

            title.setText("Google News (UK)");

            String UK = "https://newsapi.org/v2/top-headlines?sources=google-news-uk&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(UK);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }

/*#####################------------------------------------------------>>>>>>>>>  ENTERTAINMENT  <<<<<<<<<------------------------------------------------#####################*/



         else if (id == R.id.Buzzfeed) {

            title.setText("Buzzfeed");

            String Buzzfeed = "https://newsapi.org/v2/top-headlines?sources=buzzfeed&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Buzzfeed);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Daily_Mail) {

            title.setText("Daily Mail");

            String Daily_Mail = "https://newsapi.org/v2/top-headlines?sources=daily-mail&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Daily_Mail);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Entertainment_Weekly) {

            title.setText("Entertainment Weekly");

            String Entertainment_Weekly = "https://newsapi.org/v2/top-headlines?sources=entertainment-weekly&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Entertainment_Weekly);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Mashable) {

            title.setText("Mashable");

            String Mashable = "https://newsapi.org/v2/top-headlines?sources=mashable&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Mashable);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Lad_Bible) {

            title.setText("The Lad Bible");

            String The_Lad_Bible = "https://newsapi.org/v2/top-headlines?sources=the-lad-bible&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Lad_Bible);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }

/*#####################------------------------------------------------>>>>>>>>>  POLITICS  <<<<<<<<<------------------------------------------------#####################*/

         else if (id == R.id.Breitbart_News) {

            title.setText("Breitbart News");

            String Breitbart_News = "https://newsapi.org/v2/top-headlines?sources=breitbart-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Breitbart_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.La_Nacion) {

            title.setText("La Nacion");

            String La_Nacion = "https://newsapi.org/v2/top-headlines?sources=la-nacion&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(La_Nacion);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Politico) {

            title.setText("Politico");

            String Politico = "https://newsapi.org/v2/top-headlines?sources=politico&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Politico);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.The_Hill) {

            title.setText("The Hill");

            String The_Hill = "https://newsapi.org/v2/top-headlines?sources=the-hill&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(The_Hill);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }

/*#####################------------------------------------------------>>>>>>>>>  SCIENCE AND NATURE  <<<<<<<<<------------------------------------------------#####################*/


         else if (id == R.id.National_Geographic) {

            title.setText("National Geographic");

            String National_Geographic = "https://newsapi.org/v2/top-headlines?sources=national-geographic&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(National_Geographic);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.New_Scientist) {

            title.setText("New Scientist");

            String New_Scientist= "https://newsapi.org/v2/top-headlines?sources=new-scientist&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(New_Scientist);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Next_Big_Future) {

            title.setText("Next Big Future");

            String Next_Big_Future = "https://newsapi.org/v2/top-headlines?sources=next-big-future&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Next_Big_Future);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }


/*#####################------------------------------------------------>>>>>>>>>  GAMING  <<<<<<<<<------------------------------------------------#####################*/

        else if (id == R.id.IGN) {

            title.setText("IGN");

            String IGN = "https://newsapi.org/v2/top-headlines?sources=ign&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(IGN);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.Polygon) {

            title.setText("Polygon");

            String Polygon = "https://newsapi.org/v2/top-headlines?sources=polygon&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Polygon);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }



/*#####################------------------------------------------------>>>>>>>>>  MUSIC  <<<<<<<<<------------------------------------------------#####################*/


        else if (id == R.id.MTV_News) {

            title.setText("MTV News");

            String MTV_News = "https://newsapi.org/v2/top-headlines?sources=mtv-news&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(MTV_News);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }else if (id == R.id.MTV_News_UK) {

            title.setText("MTV News UK");

            String MTV_News_UK = "https://newsapi.org/v2/top-headlines?sources=mtv-news-uk&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(MTV_News_UK);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }

/*#####################------------------------------------------------>>>>>>>>>  HEALTH AND MEDICINE  <<<<<<<<<------------------------------------------------#####################*/

        else if (id == R.id.Medical_News_Today) {

            title.setText("Medical News Today");

            String Medical_News_Today = "https://newsapi.org/v2/top-headlines?sources=medical-news-today&apiKey=cb439410afcb4ef69b20154803ae69ba";
            getNews.reciveUrl(Medical_News_Today);
            manager.beginTransaction().replace(R.id.content_main_Relative_layout, getNews, getNews.getTag()).commit();

        }



//-----------------------------------------------------------------------------THE END-------------------------------------------------------------------------------------
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}



