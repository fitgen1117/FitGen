package com.fxapps.fitgen;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class Mass_Button_23 extends BaseExpandableListAdapter {
	
	private Context context;
	String []parentMassList = {"Week 1", "Week 2", "Week 3", "Week 4"};
	String [][]childMassList = {
			{	"Day 1",
				
				"Barbell Bench 5x5",
				"Squat 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Military Press 5x5",
				"Weighted Pull-Ups 5x5",
				
				"Day 2",
				
				"Repeat Day 1 after a minimum of 48 hours rest"
	},
			{	"Day 1",
		
				"Barbell Bench 5x5",
				"Squat 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Military Press 5x5",
				"Weighted Pull-Ups 5x5",
		
				"Day 2",
		
				"Repeat Day 1 after a minimum of 48 hours rest"
			},
				{	"Day 1",
	
				"Barbell Bench 5x5",
				"Squat 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Military Press 5x5",
				"Weighted Pull-Ups 5x5",
	
				"Day 2",
	
				"Repeat Day 1 after a minimum of 48 hours rest"
				},
				{	"Day 1",
	
					"Barbell Bench 5x5",
					"Squat 5x5",
					"Barbell Curl 5x5",
					"Barbell Deadlift 5x5",
					"Military Press 5x5",
					"Weighted Pull-Ups 5x5",
	
					"Day 2",
	
					"Repeat Day 1 after a minimum of 48 hours rest"
				}
	};

	public Mass_Button_23(Context context) {
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getItemViewType(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
			ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView tv = new TextView(context);
		tv.setText(childMassList[groupPosition][childPosition]);
		tv.setPadding(30,  15,  10,  15);
		tv.setTextSize(18);
		return tv;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return childMassList[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parentMassList.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean arg1, View arg2, ViewGroup arg3) {
		// TODO Auto-generated method stub
		TextView tv = new TextView(context);
		tv.setText(parentMassList[groupPosition]);
		tv.setPadding(50,  20,  10,  20);
		tv.setTextSize(25);
		return tv;
	}

	@Override
	public boolean isChildSelectable(int groupPositon, int childPosition) {
		// TODO Auto-generated method stub
		return true;
	
	}

	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
