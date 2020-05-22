package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "presciptions")



public class Presciption{

 
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "presciptionsid")
    private int mId;

    @Nullable
    @ColumnInfo(name = "Symptom")
    private String mSymptom;

    private String mDrug;

    public Presciption(@Nullable String creationDate , String symptom , int rating , String drug) {
        mSymptom = symptom;
        mDrug = drug;
        mRating = rating;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getsymptom() {
        return mSymptom;
    }

    public void setsymptom(String symptom) {
        mSymptom = symptom;
    }

    public String getDrug() {
        return mDrug;
    }

    public void setDrug(String drug) {
        mDrug = drug;
    }

    public int getRating() {
        return mRating;
    }

    public void setRating(int rating) {
        mRating = rating;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mRating;
    private String mCreationDate;

}
