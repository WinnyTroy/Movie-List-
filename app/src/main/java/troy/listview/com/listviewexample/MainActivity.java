package troy.listview.com.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] favTvShows = {"Little House on the Priery", "Matilda", "Anaconda",
                "24","Black Christmas", "Supernatural", "The Originals","Charmed"};

//        Generate a List Adapter to convert the array into something our List view can work with
//        Basically generates all of the rows for the list view
//After this, that is providing contextual information about what has been going on with the app,
//                as well as resoruces that would be useful to the app...in this case, we required a generic row layout,
//                ie simple_list_item_1

        ListAdapter theAdapter = new myAdapter(this,
                favTvShows);

//        Giving the list view itself
//        findViewById returns a view object. Everything is a view whenever we use findviewbyid
        ListView theListView = (ListView) findViewById(R.id.theListView);

//        Then we have to tell the List View what data we want it to use
        theListView.setAdapter(theAdapter);

//        Provide for an option to catch any clicks on our LIst View
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String tvShowPicked = "You Selected" + String.valueOf(adapterView.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_LONG).show();
            }
        });
    }
}
