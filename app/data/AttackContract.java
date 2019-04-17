package com.example.dnd.data;

import android.provider.BaseColumns;

/**
 * AttackContract class contains the details of the background database and its table used for
 * storing Attack object's information
 *
 *
 */
public class AttackContract implements BaseColumns {

    private static final String db_name = "Attacks.db";
    private static final String table_name = "attacksTable";
    private static final String _id = BaseColumns._ID;
    private static final String attackName = "attackName";
    private static final String hitModifier = "hitModifier";
    private static final String damageModifier = "damageModifier";
    private static final String dice_id = "dice_id";
    private static final String numOfDie = "numOfDie";

    private static final String SQL_CREATE_TABLE_ATTACKS=
            "CREATE TABLE " + table_name + " (" +
                    _id + " INTEGER PRIMARY KEY, " +
                    attackName + " TEXT NOT NULL, " +
                    dice_id + " INTEGER," +
                    hitModifier + " INTEGER," +
                    damageModifier + " INTEGER, " +
                    numOfDie + " INTEGER " +
                    ")";

    /**
     * Gets the name of the database for Attack class
     *
     * @return The database name for Attack
     * @author Atsuko  
     */
    public static String getDbName() { return db_name; }


    /**
     * Returns the sql query for creating database table for the Attack class
     *
     * @return The SQL query for creating the database table
     * @author Atsuko  
     */
    public static String getSQLCreateTable() { return SQL_CREATE_TABLE_ATTACKS; }



    /**
     * Returns the name of the table for Attack class
     *
     * @return Table name for the Attack
     * @author Atsuko  
     */
    public static String getTableName() { return table_name; }


    /**
     * Returns the name of the attack Id column in the table
     *
     * @return The name of attack ID column
     * @author Atsuko  
     */
    public static String getIdColName() { return _id; }


    /**
     * Returns the name of the hit modifier column in the table
     *
     * @return The name of the hit modifier column
     * @author Atsuko  
     */
    public static String getHitModifierColName() { return hitModifier; }


    /**
     * Returns the name of the damage modifier column in the table
     *
     * @return The name of the damage modifier column
     * @author Atsuko  
     */
    public static String getDamageModifierColName() { return damageModifier; }


    /**
     * Returns the name of the Dice ID column in the table
     *
     * @return The name of the Dice ID column
     * @author Atsuko  
     */
    public static String getDiceIdColName() { return dice_id; }


    /**
     * Returns the name of the attack name column in the database table
     *
     * @return The name of the attack name column
     * @author Atsuko  
     */
    public static String getAttackNameColName() { return attackName; }



    /**
     * Returns the name of the number of dice column in the database table
     *
     * @return The name of the column for number(s) of die
     * @author Atsuko  
     */
    public static String getNumOfDieColName() { return numOfDie; }
}
