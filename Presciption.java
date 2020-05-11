package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "prescipt")



public class Presciption{

 
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "presciptionsid")
    private int mId;

    @Nullable
    @ColumnInfo(name = "Symptom")
    private String mSymptom;

    private String mDrug;

    public prescipt(@Nullable String CreationDate , String Symptom , int Rating , String Drug) {
        mSymptom = symptom;
        mDrug = Drug;
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
        msymptom = symptom;
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
