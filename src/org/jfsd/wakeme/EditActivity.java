package org.jfsd.wakeme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EditActivity extends Activity {

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

    }

    // onClick methods
    public void onClickButtonSave(View v) {
        Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show();
    }

    public void onClickButtonWake(View v) {
        Toast.makeText(this, "Wake up!!", Toast.LENGTH_SHORT).show();
    }

}
