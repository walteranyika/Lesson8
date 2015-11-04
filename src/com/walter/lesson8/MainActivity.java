package com.walter.lesson8;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	int id =item.getItemId();
    	switch(id)
    	{
    	  case R.id.action_settings:
    		  Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
    		  break;
    	  case R.id.action_share:
    		  Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
    		  break;
    	  case R.id.action_delete:
    		  Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
    		  break; 
    	  case R.id.action_favourite:
    		  Toast.makeText(this, "Favourite", Toast.LENGTH_SHORT).show();
    		  break;    		  
    	}
    	return super.onOptionsItemSelected(item);
    }
    public void show_dialog(View v)
    {
       	AlertDialog.Builder builder=new AlertDialog.Builder(this);
       	builder.setCancelable(false);
       	builder.setMessage("Do you really want to close this app?");
       	builder.setPositiveButton("Yes", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();				
			}
		});
       	builder.setNegativeButton("No", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();				
			}
		});
    	
       	AlertDialog dialog= builder.create();
       	dialog.setTitle("Close App");
       	dialog.show();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
