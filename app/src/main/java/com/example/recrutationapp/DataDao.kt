package com.example.recrutationapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DataDao {
    @Insert
    fun insertData(data: DataEntity): Long

    @Query("SELECT * FROM ${DataEntity.TABLE_NAME} WHERE id_repo= :id_repo")
    fun findByRepoId(id_repo: Long): List<DataEntity>

    @Query("SELECT *FROM ${DataEntity.TABLE_NAME} WHERE repo_name= repo_name")
    fun findByRepoName(repo_name: String)
}