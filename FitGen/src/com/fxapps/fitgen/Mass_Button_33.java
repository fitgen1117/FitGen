package com.fxapps.fitgen;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class Mass_Button_33 extends BaseExpandableListAdapter {
	
	private Context context;
	String []parentList = {"Week 1", "Week 2", "Week 3", "Week 4"};
	String [][]childList = {
			{	"Day 1",
				
				"Barbell Rows 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Sit-Ups (Until Exhaustion)",
				
				"Day 2",
				
				"Barbell Bench Press 5x5",
				"Dumbbell Shoulder Press 5x5",
				"Close-Grip Bench Press 5x8",
				"Flutter Kickes 5 x 40",
				
				"Day 3",
				
				"Barbell Squats 5x5",
				"Barbell/Dumbbell Stiff Leg Deadlifts 5x5",
				"Weighted Calf Raises 3x12",
				"Weighted Crunches (3x12"
			},
			{	"Day 1",
				
				"Barbell Rows 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Sit-Ups (Until Exhaustion)",
				
				"Day 2",
				
				"Barbell Bench Press 5x5",
				"Dumbbell Bench Press 3x8",
				"Dumbbell Shoulder Press 5x5",
				"Close-Grip Bench Press 5x8",
				"Flutter Kickes 5 x 40",
				
				"Day 3",
				
				"Barbell Squats 5x5",
				"Barbell/Dumbbell Stiff Leg Deadlifts 5x5",
				"Weighted Calf Raises 3x12",
				"Weighted Crunches (3x12"
			},
			{	"Day 1",
				
				"Barbell Rows 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Sit-Ups (Until Exhaustion)",
				
				"Day 2",
				
				"Barbell Bench Press 5x5",
				"Dumbbell Shoulder Press 5x5",
				"Close-Grip Bench Press 5x8",
				"Flutter Kickes 5 x 40",
				
				"Day 3",
				
				"Barbell Squats 5x5",
				"Barbell/Dumbbell Stiff Leg Deadlifts 5x5",
				"Weighted Calf Raises 3x12",
				"Weighted Crunches (3x12"
			},
{	"Day 1",
				
				"Barbell Rows 5x5",
				"Barbell Curl 5x5",
				"Barbell Deadlift 5x5",
				"Sit-Ups (Until Exhaustion)",
				
				"Day 2",
				
				"Barbell Bench Press 5x5",
				"Dumbbell Bench Press 3x8",
				"Dumbbell Shoulder Press 5x5",
				"Close-Grip Bench Press 5x8",
				"Flutter Kickes 5 x 40",
				
				"Day 3",
				
				"Barbell Squats 5x5",
				"Barbell/Dumbbell Stiff Leg Deadlifts 5x5",
				"Weighted Calf Raises 3x12",
				"Weighted Crunches (3x12"
			},
	};

	public Mass_Button_33(Context context) {
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
		tv.setText(childList[groupPosition][childPosition]);
		tv.setPadding(30,  15,  10,  15);
		tv.setTextSize(20);
		return tv;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		// TODO Auto-generated method stub
		return childList[groupPosition].length;
	}

	@Override
	public Object getGroup(int groupPosition) {
		// TODO Auto-generated method stub
		return groupPosition;
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return parentList.length;
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
		tv.setText(parentList[groupPosition]);
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
