package com.example.apptc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BdTabelaPaciente implements BaseColumns {


    public static final String Nome_Tabela = "Paciente";
    public static final String Nome = "Nome";
    public static final String Idade = "Idade";
    public static final String Patologia = "Patologia";
    public static final String Tipo_de_Sangue= "Tipo_de_Sangue";
    private SQLiteDatabase db;

    public static final String[] TODAS_COLUNAS = new String[] { _ID, Nome, Idade, Patologia, Tipo_de_Sangue };

    public BdTabelaPaciente(SQLiteDatabase db) {
        this.db = db;
    }

    public void cria() {
        db.execSQL(
                "CREATE TABLE " + Nome_Tabela + "(" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        Nome + " TEXT NOT NULL, " +
                        Idade + " TEXT NOT NULL, " +
                        Patologia + " TEXT NOT NULL, " +
                        Tipo_de_Sangue + " TEXT NOT NULL " +
                        ")"
        );
    }
    public Cursor query (String[]columns, String selection, String[]selectionArg, String groupby, String having, String orderBy){
        return db.query(Nome_Tabela, columns, selection, selectionArg, groupby, having, orderBy);
    }

    public long insert (ContentValues values){
        return db.insert(Nome_Tabela, null, values);
    }

    public int update (ContentValues values, String whereClause, String []whereArgs){
        return db.update(Nome_Tabela, values, whereClause, whereArgs);
    }
    public int delete (String whereClause, String []whereArgs){
        return db.delete(Nome_Tabela, whereClause, whereArgs);

    }

}
