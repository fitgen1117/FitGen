package com.fxapps.fitgen;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Mass_Button_3 extends Activity {
	@ Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_container);
		
		ActionBar actionbar = getActionBar();
	    actionbar.setDisplayHomeAsUpEnabled(true);
	
      //Tell the ActionBar we want to use Tabs.
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
      //initiating both tabs and set text to it.
        ActionBar.Tab InstructTab = actionbar.newTab().setText("Instructions");
        ActionBar.Tab Day1Tab = actionbar.newTab().setText("Day1");
        ActionBar.Tab Day2Tab = actionbar.newTab().setText("Day2");
        ActionBar.Tab Day3Tab = actionbar.newTab().setText("Day3");
 
     //create the two fragments we want to use for display content
        Fragment InstructFragment = new Mass_Button_31();
        Fragment Day1Fragment = new Mass_Button_32();
        Fragment Day2Fragment = new Mass_Button_33();
        Fragment Day3Fragment = new Mass_Button_34();
 
    //set the Tab listener. Now we can listen for clicks.
        InstructTab.setTabListener(new TabListener(InstructFragment));
        Day1Tab.setTabListener(new TabListener(Day1Fragment));
        Day2Tab.setTabListener(new TabListener(Day2Fragment));
        Day3Tab.setTabListener(new TabListener(Day3Fragment));
 
   //add the three tabs to the actionbar
        actionbar.addTab(InstructTab);
        actionbar.addTab(Day1Tab);
        actionbar.addTab(Day2Tab);
        actionbar.addTab(Day3Tab);
    }
	
	  @Override
	    protected void onSaveInstanceState(Bundle outState) {
	        super.onSaveInstanceState(outState);
	        outState.putInt("tab", getActionBar().getSelectedNavigationIndex());
	    }

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		

	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.gym_find:
	            Intent intent = new Intent(this, GymLocator.class);
	            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	            startActivity(intent);
	            return true;
	            
		        case R.id.music:
		            Intent intent_music = new Intent(this, MusicPlayer.class);
		            intent_music.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		            startActivity(intent_music);
		            return true;
		        default:
		            return super.onOptionsItemSelected(item);
		    }
			};
	  }
	
	