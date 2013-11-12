package com.fxapps.fitgen;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseMass {
	
	private static final String dbName = "ExerciseDB";
	private static final int dbVersion = 1;
	
	static final String chestTable = "Chest Exercises";
	static final String colChestID = "exChestID";
	static final String colChestName = "exChestName";
	static final String colChestSet = "setChestNumber";
	static final String colChestRep = "repChestNumber";
	
	static final String armTable = "Arm Exercises";
	static final String colArmID = "exArmID";
	static final String colArmName = "exArmName";
	static final String colArmSet = "setArmNumber";
	static final String colArmRep = "repArmNumber";
	
	static final String backTable = "Back Exercises";
	static final String colBackID = "exBackID";
	static final String colBackName = "exBackName";
	static final String colBackSet = "setBackNumber";
	static final String colBackRep = "repBackNumber";
	
	static final String shoulderTable = "Shoulder Exercises";
	static final String colShoulderID = "exShoulderID";
	static final String colShoulderName = "exShoulderName";
	static final String colShoulderSet = "setShoulderNumber";
	static final String colShoulderRep = "repShoulderNumber";
	
	static final String legTable = "Leg Exercises";
	static final String colLegID = "exLegID";
	static final String colLegName = "exLegName";
	static final String colLegSet = "setLegNumber";
	static final String colLegRep = "repLegNumber";
	
	private DbHelper ourHelper;
	private DbHelper ourDatabase;
	private final Context ourContext;
	private static class DbHelper extends SQLiteOpenHelper {

		public DbHelper(Context context){
			super(context, dbName,null, dbVersion);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE "+chestTable+" ("+colChestID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+colChestName+ "TEXT NOT NULL , "+colChestSet+ "TEXT NOT NULL , "+colChestRep+ "TEXT NOT NULL)");
			
			db.execSQL("CREATE TABLE "+armTable+" ("+colArmID+ "INTEGER PRIMARY KEY AUTOINCREMENT, "+colArmName+ "TEXT NOT NULL , "+colArmSet+ "TEXT NOT NULL , "+colArmRep+ "TEXT NOT NULL)");
			
			db.execSQL("CREATE TABLE "+backTable+" ("+colBackID+ "INTEGER PRIMARY KEY AUTOINCREMENT, "+colBackName+ "TEXT NOT NULL , "+colBackSet+ "TEXT NOT NULL , "+colBackRep+ "TEXT NOT NULL)");
			
			db.execSQL("CREATE TABLE "+shoulderTable+" ("+colShoulderID+ "INTEGER PRIMARY KEY AUTOINCREMENT, "+colShoulderName+ "TEXT NOT NULL,  "+colShoulderSet+ "TEXT NOT NULL , "+colShoulderRep+ "TEXT NOT NULL)");
			
			db.execSQL("CREATE TABLE "+legTable+" ("+colLegID+ "INTEGER PRIMARY KEY AUTOINCREMENT, "+colLegName+ "TEXT , "+colLegSet+ "TEXT NOT NULL , "+colLegRep+ "TEXT NOT NULL)");
			
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS " +chestTable +armTable +backTable + shoulderTable +legTable);
			onCreate(db);
			
		}

		public long insert(String chesttable, Object object, ContentValues cv) {
			// TODO Auto-generated method stub
			return 0;
		}
				
	}
	
	public DatabaseMass(Context c){
		ourContext = c;
	}
	
	public DatabaseMass open(){
		ourHelper = new DbHelper(ourContext);
		ourHelper.getWritableDatabase();
		return this;
	}
	
	public void close(){
		ourHelper.close();
	}
	
	public long createEntry(String name, String set, String rep) {
		ContentValues cv = new ContentValues();
		cv.put(colChestName, name);
		cv.put(colChestSet, set);
		cv.put(colChestRep, rep);
		return ourDatabase.insert(chestTable, null, cv);
		
	}
}
		
	


