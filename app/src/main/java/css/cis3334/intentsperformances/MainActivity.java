package css.cis3334.intentsperformances;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Web, but1Calendar, btn1Map;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();
        setupButtonClickEvents2();
        setupButtonClickEvents3();



    }


    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");

                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "The Power of Restorative Justice with Lara Bazelon");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2020, 1, 18, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2020, 1, 18, 21, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(calIntent);
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(mapIntent);
                }
            }
        });


    }
    private void setupButtonClickEvents2() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");

                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar2);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "\t\n" +
                        "High School Band Exchange Concert ");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Burns Wellness Center 249");
                GregorianCalendar begDate = new GregorianCalendar(2020, 1, 28, 17, 0);
                GregorianCalendar endDate = new GregorianCalendar(2020, 1, 28, 19, 0);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(calIntent);
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map2);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(mapIntent);
                }
            }
        });


    }
    private void setupButtonClickEvents3() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo3);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");

                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar3);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "\t\n" +
                        "Building Beyond Bridges CSS Stel Bad and World Drumming Ensemble");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2020, 1, 29, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2020, 1, 29, 21, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(calIntent);
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map3);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if(activities.size() > 0){
                    startActivity(mapIntent);
                }
            }
        });


    }


}