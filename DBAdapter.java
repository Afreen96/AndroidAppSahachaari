package com.example.aasia.sahachaari;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DBAdapter {
    static final String KEY_ROWID = "_id";
    static final String KEY_NAME = "name";
    static final String KEY_ING = "ing";
    static final String KEY_IName= "iname";
    static final String TAG = "DBAdapter";
    static final String DATABASE_NAME = "RecipeDb";
    static final String DATABASE_TABLE = "recipe";
    static final int DATABASE_VERSION = 1;
    static final String DATABASE_CREATE =
            "create table recipe (_id integer primary key, "
                    + "name text not null, ing text not null, iname text not null);";
    final Context context;
    DatabaseHelper DBHelper;
    SQLiteDatabase db;
    public DBAdapter(Context ctx)
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }
    private static class DatabaseHelper extends SQLiteOpenHelper
    {
        DatabaseHelper(Context context)
        {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase db)
        {
            try {
                db.execSQL(DATABASE_CREATE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        @Override
        public void onUpgrade(SQLiteDatabase db,int a, int b)
        {
            db.execSQL("DROP TABLE IF EXISTS recipe");
            onCreate(db);
        }
    }
    //---opens the database---
    public DBAdapter open() throws SQLException
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }
    //---closes the database---
    public void close()
    {
        DBHelper.close();
    }
    //---insert a contact into the database---
    public long insertRecipe(String id,String name, String ing, String iname)
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_ROWID,id);
        initialValues.put(KEY_NAME, name);
        initialValues.put(KEY_ING, ing);
        initialValues.put(KEY_IName, iname);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }
    public void deleteTable(){
        db.execSQL("DROP TABLE IF EXISTS recipe");
        DBHelper.onCreate(db);
    }
    //---deletes a particular contact---
    public boolean deleteRecipe(long rowId)
    {
        return db.delete(DATABASE_TABLE, KEY_ROWID + "=" + rowId, null) > 0;
    }
    //---retrieves all the contacts---
    /*public Cursor getAllContacts()
    {
        return db.query(DATABASE_TABLE, new String[] {KEY_ROWID, KEY_NAME,
                KEY_EMAIL}, null, null, null, null, null);
    }*/


    //---retrieves a particular contact---
    public Cursor getRecipe(long rowId) throws SQLException
    {
        Cursor mCursor = db.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,
                KEY_NAME, KEY_ING, KEY_IName}, KEY_ROWID + "=" + rowId, null,null, null, null, null);
        if (mCursor != null)
        {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //---updates a contact---
    /*public boolean updateContact(long rowId, String name, String email)
    {
        ContentValues args = new ContentValues();
        args.put(KEY_NAME, name);
        args.put(KEY_EMAIL, email);
        return db.update(DATABASE_TABLE, args, KEY_ROWID + "=" + rowId, null) > 0;
    }*/
}