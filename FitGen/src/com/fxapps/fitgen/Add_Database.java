package com.fxapps.fitgen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Add_Database extends Activity implements OnClickListener {
	
	Button btn_update, btn_view_update_db;
	EditText SQLName, SQLSet, SQLRep;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.database_add);
		btn_update = (Button) findViewById(R.id.btn_update_db);
		btn_view_update_db = (Button) findViewById(R.id.btn_view_update_db);
		SQLName = (EditText) findViewById(R.id.SQLName);
		SQLSet = (EditText) findViewById(R.id.SQLSet);
		SQLRep= (EditText) findViewById(R.id.SQLRep);
		
		btn_view_update_db.setOnClickListener(this);
		btn_update.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View arg0) {
		
		switch (arg0.getId()) {
		
		case R.id.btn_update_db:
			
			String name = SQLName.getText().toString();
			String set = SQLSet.getText().toString();
			String rep = SQLRep.getText().toString();
			
			DatabaseMass entry = new DatabaseMass(Add_Database.this);
			
			break;
			
		case R.id.btn_view_update_db:
			break;
		}
		
		
	}

}
