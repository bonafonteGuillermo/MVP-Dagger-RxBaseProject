package app.demo.example.com.mytemplateapplication.app.injection

import android.content.SharedPreferences
import app.demo.example.com.mytemplateapplication.app.injection.AppScope
import app.demo.example.com.mytemplateapplication.data.AppDatabase
import app.demo.example.com.mytemplateapplication.repository.Api
import app.demo.example.com.mytemplateapplication.repository.IRepository
import app.demo.example.com.mytemplateapplication.repository.mock.Repository as MockRepository
import app.demo.example.com.mytemplateapplication.repository.remote.Repository as RemoteRepository
import dagger.Module
import dagger.Provides
import app.demo.example.com.mytemplateapplication.rx.Schedulers
import app.demo.example.com.mytemplateapplication.utils.Configuration

/**
 * Created by Guillermo Bonafonte Criado
 */
@Module
class RepositoryModule {

    @AppScope
    @Provides
    fun provideRepository(api: Api, localStorage: AppDatabase, schedulers: Schedulers, preferences: SharedPreferences): IRepository =
        when (Configuration().Environment) {
            Configuration.Variant.MOCK -> MockRepository()
            else -> RemoteRepository(api, localStorage, schedulers, preferences)
        }
}