package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by kienme on 23/11/16.
 *
 */

public class JokeFetchTest extends AndroidTestCase {
    private static final String LOG_TAG = "JokeFetchTest";

    public void test() {
        Log.i(LOG_TAG, "Running JokeFetchTest");
        String result = null;
        FetchAJoke fetcher = new FetchAJoke();
        fetcher.execute(getContext());

        try {
            result = fetcher.get();
            Log.d(LOG_TAG, "Result: "+result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
    }
}
