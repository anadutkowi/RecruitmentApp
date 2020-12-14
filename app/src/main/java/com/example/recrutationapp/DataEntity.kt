package com.example.recrutationapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.recrutationapp.DataEntity.Companion.COLUMN_ID
import com.example.recrutationapp.DataEntity.Companion.TABLE_NAME


@Entity(
    tableName = TABLE_NAME,
    indices = [Index(COLUMN_ID)]
)

data class DataEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    var id: Long,

    @ColumnInfo(name= COLUMN_NAME )
    var repo_name: String,

    @ColumnInfo(name= COLUMN_AUTHOR )
    var repo_author: String,

    @ColumnInfo(name = COLUMN_RATE)
    var stars: Long,

    @ColumnInfo(name = COLUMN_REPO_LINK)
    var repo_link: String,

    @ColumnInfo(name = COLUMN_PHOTO)
    var author_photo: String
) {
    companion object{
        const val TABLE_NAME = "repository"
        const val COLUMN_ID = "id_repo"
        const val COLUMN_NAME = "repo_name"
        const val COLUMN_AUTHOR = "repo_author"
        const val COLUMN_RATE = "stars"
        const val COLUMN_REPO_LINK = "repo_link"
        const val COLUMN_PHOTO = "author_photo"
    }
}