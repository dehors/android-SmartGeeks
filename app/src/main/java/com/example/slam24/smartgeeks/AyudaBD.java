package com.example.slam24.smartgeeks;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by SLAM24 on 8/1/2017.
 */

public class AyudaBD extends SQLiteOpenHelper {
    public static class DatosTabla implements BaseColumns {
        public static final String TABLE_NAME = "Ditectory";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "nombres";
        public static final String COLUMN_PHONE = "telefono";

        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";
        private static final String CREAR_TABLA_1 =
                "CREATE TABLE " + DatosTabla.TABLE_NAME + " (" +
                        DatosTabla.COLUMN_ID + " INTEGER PRIMARY KEY," +
                        DatosTabla.COLUMN_NAME + " TEXT," +
                        DatosTabla.COLUMN_PHONE + " TEXT)";

        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + DatosTabla.TABLE_NAME;
    }
    public static  final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";

    public AyudaBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DatosTabla.CREAR_TABLA_1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
