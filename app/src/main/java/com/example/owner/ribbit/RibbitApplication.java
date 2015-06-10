package com.example.owner.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Owner on 2015-06-09.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "cC8qjPXNH94obqO4M6BO3Uyv3xYccx6pknqMoamG",
                "PIhEzr6PMtjFUuv7XVEQUe2iywlEqroF87Fqxnf8");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}