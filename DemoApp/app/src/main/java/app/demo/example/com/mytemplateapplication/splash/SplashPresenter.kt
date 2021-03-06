package app.demo.example.com.mytemplateapplication.splash

import io.reactivex.disposables.Disposable
import app.demo.example.com.mytemplateapplication.repository.IRepository
import app.demo.example.com.mytemplateapplication.rx.Schedulers

/**
 *
 * Presenter for Splash screen.
 *
 * Created by Guillermo Bonafonte Criado
 */
class SplashPresenter(private var view: ISplashView, override var repository: IRepository, private var schedulers: Schedulers) : ISplashPresenter {

    private lateinit var subscription: Disposable

    override fun onCreate() {

    }

    override fun onDestroy() {
        subscription.dispose()
    }
}
