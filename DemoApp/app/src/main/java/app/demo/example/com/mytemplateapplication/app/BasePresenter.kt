package app.demo.example.com.mytemplateapplication.app

import app.demo.example.com.mytemplateapplication.repository.IRepository
/**
 * Created by Guillermo Bonafonte Criado
 */
interface BasePresenter {

    var repository: IRepository

    fun onCreate()
    fun onDestroy()
}