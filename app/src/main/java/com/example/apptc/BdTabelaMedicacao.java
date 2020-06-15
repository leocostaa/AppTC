package com.example.apptc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BdTabelaMedicacao implements BaseColumns {

    public static final String Nome_Tabela = "Paciente";
    public static final String Nome = "Nome";
    public static final String Composicao = "Composicao";
    public static final String Bula_Digital = "Bula_digital";
    public static final String Lab = "Lab";
    public static final String Restricoes = "Restricoes";
    private SQLiteDatabase db;

    public static final String[] TODAS_COLUNAS = new String[] { _ID, Nome, Composicao, Bula_Digital, Lab ,Restricoes };

    public BdTabelaMedicacao(SQLiteDatabase db) {
        this.db = db;
    }

    public void cria() {
        db.execSQL(
                "CREATE TABLE " + Nome_Tabela + "(" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        Nome + " TEXT NOT NULL, " +
                        Composicao + " TEXT NOT NULL, " +
                        Bula_Digital + " TEXT NOT NULL, " +
                        Lab + " TEXT NOT NULL, " +
                        Restricoes + " TEXT NOT NULL " +
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
