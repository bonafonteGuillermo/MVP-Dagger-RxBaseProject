package app.demo.example.com.mytemplateapplication.repository.remote

import android.content.SharedPreferences
import app.demo.example.com.mytemplateapplication.data.AppDatabase
import app.demo.example.com.mytemplateapplication.repository.Api
import app.demo.example.com.mytemplateapplication.repository.IRepository
import app.demo.example.com.mytemplateapplication.rx.Schedulers

class Repository(private val api : Api,
                 private val localStorage : AppDatabase,
                 private val schedulers : Schedulers,
                 private val preferences : SharedPreferences
) : IRepository {


}