package com.fxapps.fitgen;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseMass extends SQLiteOpenHelper {
	
	static final String dbName = "ExerciseDB";
	static final String chestTable = "Chest Exercises";
	static final String colChestID = "exChestName";
	static final String colChestSet = "setChestNumber";
	static final String colChestRep = "repChestNumber";
	
	static final String armTable = "Arm Exercises";
	static final String colArmID = "exArmName";
	static final String colArmSet = "setArmNumber";
	static final String colArmRep = "repArmNumber";
	
	static final String backTable = "Back Exercises";
	static final String colBackID = "exBackName";
	static final String colBackSet = "setBackNumber";
	static final String colBackRep = "repBackNumber";
	
	static final String shoulderTable = "Shoulder Exercises";
	static final String colShoulderID = "exShoulderName";
	static final String colShoulderSet = "setShoulderNumber";
	static final String colShoulderRep = "repShoulderNumber";
	
	static final String legTable = "Leg Exercises";
	static final String colLegID = "exLegName";
	static final String colLegSet = "setLegNumber";
	static final String colLegRep = "repLegNumber";
	
	

public DatabaseMass(Context context) {
	super(context, dbName, null, 33);
}

public void onCreate(SQLiteDatabase db) {
	
	db.execSQL("CREATE TABLE "+chestTable+" ("+colChestID+ " TEXT , "+colChestSet+ "INTEGER PRIMARY KEY , "+colChestRep+ "INTEGER PRIMARY KEY)");
	
	db.execSQL("CREATE TABLE "+armTable+" ("+colArmID+ "TEXT , "+colArmSet+ "INTEGER PRIMARY KEY , "+colArmRep+ "INTEGER PRIMARY KEY)");
	
	db.execSQL("CREATE TABLE "+backTable+" ("+colBackID+ "TEXT , "+colBackSet+ "INTEGER PRIMARY KEY , "+colBackRep+ "INTEGER PRIMARY KEY)");
	
	db.execSQL("CREATE TABLE "+shoulderTable+" ("+colShoulderID+ "TEXT , "+colShoulderSet+ "INTEGER PRIMARY KEY , "+colShoulderRep+ "INTEGER PRIMARY KEY)");
	
	db.execSQL("CREATE TABLE "+legTable+" ("+colLegID+ "TEXT , "+colLegSet+ "INTEGER PRIMARY KEY , "+colLegRep+ "INTEGER PRIMARY KEY)");
}

@Override
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	// TODO Auto-generated method stub
	
}
}
