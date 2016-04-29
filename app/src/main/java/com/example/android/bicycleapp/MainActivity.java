package com.example.android.bicycleapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.List;

public class MainActivity extends ActionBarActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private void loadLoginView() {
        Intent intent = new Intent(this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    private Firebase mRef;

    protected List<BikeApp> bikeAppData;

    protected BikeApp aBikeApp;
    public final static String EXTRA_SERIAL_NUMBER = "EXTRA_SERIAL_NUMBER";
    public final static String EXTRA_TITLE = "EXTRA_TITLE";
    public final static String EXTRA_DESC = "EXTRA_DESC";
    public final static String EXTRA_IMAGE = "EXTRA_IMAGE";
    public final static String EXTRA_RATINGS = "EXTRA_RATINGS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Check Authentication
        mRef = new Firebase(Constants.FIREBASE_URL);
        if (mRef.getAuth() == null) {
            loadLoginView();
        }
        setContentView(R.layout.activity_main);

        this.setTitle(getResources().getString(R.string.Bike));


        bikeAppData = DataManager.getData();

        ArrayAdapter<BikeApp> myAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, bikeAppData);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BikeApp bikeApp = bikeAppData.get(position);
                displayDetail(bikeApp);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:

                return true;


            case R.id.action_about:
                Intent intent = new Intent(this, AboutPage.class);
                startActivity(intent);

                return true;

            case R.id.action_contact:
                Intent intent1 = new Intent(this, Contact.class);
                startActivity(intent1);

                return true;


        }
        if (id == R.id.action_logout) {
            mRef.unauth();
            loadLoginView();
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayDetail(BikeApp bikeApp) {

        Intent intent = new Intent(this, PartDetailActivity.class);
        intent.putExtra(EXTRA_SERIAL_NUMBER, bikeApp.getserialn());
        intent.putExtra(EXTRA_TITLE, bikeApp.getTitle());
        intent.putExtra(EXTRA_DESC, bikeApp.getDescription());
        intent.putExtra(EXTRA_IMAGE, bikeApp.getImageName());
        intent.putExtra(EXTRA_RATINGS, bikeApp.getrating());

        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.bicycleapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.android.bicycleapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
