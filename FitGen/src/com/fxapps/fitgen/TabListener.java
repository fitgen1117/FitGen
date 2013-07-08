package com.fxapps.fitgen;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;

public class TabListener implements android.app.ActionBar.TabListener{

	public Fragment fragment;
	 
	public TabListener(Fragment fragment) {
	this.fragment = fragment;
	}
	 
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}
	 
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
	ft.replace(R.id.fragment_container, fragment);
	}
	 
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	ft.remove(fragment);
	}
	 
	}