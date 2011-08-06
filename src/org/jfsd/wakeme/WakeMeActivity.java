package org.jfsd.wakeme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WakeMeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onStart()
     */
    @Override
    protected void onStart() {
        super.onStart();

        Intent editActivity = new Intent(this, EditActivity.class);
        startActivity(editActivity);
        this.finish();
    }

}
