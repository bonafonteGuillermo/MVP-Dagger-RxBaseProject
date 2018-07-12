package app.demo.example.com.mytemplateapplication.app.injection

import app.demo.example.com.mytemplateapplication.data.AppDatabase
import android.arch.persistence.room.*
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 *
 * Dagger module for database.
 *
 * Created by Pablo Arqueros on 11/22/2017.
 * 2017 © Cognizant Technology Solutions
 */


@Module
class DatabaseModule {

    @Provides
    fun providesAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "my-app-db").build()
}
