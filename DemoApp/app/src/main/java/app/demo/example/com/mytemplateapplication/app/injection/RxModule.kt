package app.demo.example.com.mytemplateapplication.app.injection

import dagger.Module
import dagger.Provides
import app.demo.example.com.mytemplateapplication.rx.Schedulers
import app.demo.example.com.mytemplateapplication.rx.AppSchedulers

/**
 *
 * Dagger module for Rx schedulers
 *
 * Created by Guillermo Bonafonte Criado
 */
@Module
class RxModule {

    @Provides
    fun provideRxSchedulers(): Schedulers {
        return AppSchedulers()
    }
}