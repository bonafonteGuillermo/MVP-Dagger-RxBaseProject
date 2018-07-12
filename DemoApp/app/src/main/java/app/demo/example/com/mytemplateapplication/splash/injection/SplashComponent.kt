package app.demo.example.com.mytemplateapplication.splash.injection

import app.demo.example.com.mytemplateapplication.app.injection.AppComponent
import app.demo.example.com.mytemplateapplication.splash.SplashActivity
import dagger.Component

/**
 *
 * Dagger component for Splash screen. Depends on AppComponent.
 *
 */
@SplashScope
@Component(modules = [(SplashContextModule::class), (SplashModule::class)], dependencies = [(AppComponent::class)])
interface SplashComponent {
    fun inject(activity: SplashActivity)
}