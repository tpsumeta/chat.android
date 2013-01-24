package org.chat.android;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
    
    public void showVideoActivity(View view) {
    	Intent myIntent = new Intent(HomeActivity.this, PickVideoActivity.class);
    	HomeActivity.this.startActivity(myIntent);
    }
    
    public void showFormActivity(View view) {
//		Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage("org.odk.collect.android");
//		startActivity(LaunchIntent);    	THIS WORKS BUT, BELOW ALLOWS SPECIFIC CLASS TO BE CALLED
    	
		Intent intent = new Intent();
		intent.setComponent(new ComponentName("org.odk.collect.android","org.odk.collect.android.activities.FormChooserList"));
		startActivity(intent);
		
    }
}