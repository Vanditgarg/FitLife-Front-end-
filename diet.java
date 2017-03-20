package com.example.rock.gymlife;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class MainActivity5Activity extends Activity {
    WebView wv, wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);

        wv = (WebView) findViewById(R.id.wv);
        wv.loadUrl("http://www.muscleandfitness.com/nutrition/gain-mass/best-protein-your-bodybuilding-goals");

        wv1 = (WebView) findViewById(R.id.wv1);
        wv1.loadUrl("http://www.bodybuilding.com/fun/randy9.htm");
    }
}


