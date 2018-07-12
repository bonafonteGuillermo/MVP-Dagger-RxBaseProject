package app.demo.example.com.mytemplateapplication.app.injection

import android.content.SharedPreferences
import app.demo.example.com.mytemplateapplication.data.AppDatabase
import app.demo.example.com.mytemplateapplication.repository.IRepository
import app.demo.example.com.mytemplateapplication.rx.Schedulers
import dagger.Component
import javax.inject.Singleton

/**
 *
 * Dagger component for app
 *
 * Created by Guillermo Bonafonte Criado
 */
@Singleton
@AppScope
@Component(modules = [
    (ApiModule::class),
    (AppContextModule::class),
    (NetworkingModule::class),
    (RepositoryModule::class),
    (RxModule::class),
    (SharedPreferencesModule::class),
    (DatabaseModule::class)]
)

interface AppComponent {

    fun rxSchedulers(): Schedulers
    fun repository(): IRepository
    fun sharedPreferences(): SharedPreferences
    fun database(): AppDatabase

}