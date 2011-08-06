package org.jfsd.wakeme;

import android.app.ListActivity;
import android.os.Bundle;

public class SelectActivity extends ListActivity {

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

}
