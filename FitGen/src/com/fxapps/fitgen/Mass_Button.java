package com.fxapps.fitgen;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;


public class Mass_Button extends Activity {
	int count=0;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mass__button);
		
		ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
		
		}

		public void onCheckboxClicked(View view) {    
			boolean checked = ((CheckBox) view).isChecked();
			switch (view.getId()) {
			case R.id.chkSunday:
				if (checked) {
				  count ++;
				}
				else {
					count--;
				}
				break;
			  
			case R.id.chkMonday:
				if (checked) {
					count++;
				}
				else {
					count--;
				}
				break;
				
			case R.id.chkTuesday:
				if (checked) {
					count++;
				}
				else {
					count--;
				}
				break;
			  
			case R.id.chkWednesday:
				if (checked) {
					count++;
				}
				else {
					count--;
				}
				break;
			  
			case R.id.chkThursday:
				if (checked) {
					count++;
				}
				else {
					count--;
				}
				break;
			  
			case R.id.chkFriday:
				if (checked) {
					count++;
				}
				else {
					count--;
				}
				break;
			  
			case R.id.chkSaturday:
				if (checked) {
					count++;
				}
				else {
					count--;
				}
				break;
				
			}
      
	
			Button bGo = (Button) findViewById(R.id.bGo);
			bGo.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					
					if (count==2) {
						Intent intent = new Intent(v.getContext(), Mass_Button_21.class);
						startActivityForResult(intent,0);
					}
					
					if (count==3) {
						Intent intent = new Intent(v.getContext(), Mass_Button_3.class);
						startActivityForResult(intent,0);
						
					}
					
					if (count==4) {
						Intent intent = new Intent(v.getContext(), Mass_Button_4.class);
						startActivityForResult(intent,0);
					}
					
					if (count==5) {
						Intent intent = new Intent(v.getContext(), Mass_Button_5.class);
						startActivityForResult(intent,0);
						
					}
					
					else {
						
					}
					
					
				}
			});
		}
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.mass__button, menu);
			return true;
		}
		

		public boolean onOptionsItemSelected(MenuItem item) {
		    switch (item.getItemId()) {
		        case R.id.gym_find:
		            Intent intent = new Intent(this, GymLocator.class);
		            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		            startActivity(intent);
		            return true;
		        default:
		            return super.onOptionsItemSelected(item);
		    }
		
}
}




			


		
				
			

			
				
			
