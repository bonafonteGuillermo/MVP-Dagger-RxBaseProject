package app.demo.example.com.mytemplateapplication.app.injection

import android.content.Context
import android.content.SharedPreferences
import com.securepreferences.SecurePreferences
import dagger.Module
import dagger.Provides

/**
 * Created by Guillermo Bonafonte
 */

@Module
class SharedPreferencesModule {

    @AppScope
    @Provides
    fun providesSharedPreferences(context: Context): SharedPreferences =
            SecurePreferences(context, "mypreferences", "user_prefs.xml")


}