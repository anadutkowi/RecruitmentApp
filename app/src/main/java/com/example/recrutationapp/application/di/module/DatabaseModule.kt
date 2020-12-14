package com.example.recrutationapp.application.di.module

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import com.example.recrutationapp.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DatabaseModule {
    @Module
    companion object {
        private const val DATABASE_MODULE = "RecruitmentRoomDatabase"

        @Provides
        @Singleton
        @JvmStatic
        fun provideAppDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_MODULE)
                .fallbackToDestructiveMigration().build()
        }

        @Provides
        @JvmStatic
        fun provideDataDao(database: AppDatabase) = database.dataDao()
    }
}