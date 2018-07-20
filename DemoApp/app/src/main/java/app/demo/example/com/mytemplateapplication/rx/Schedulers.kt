package app.demo.example.com.mytemplateapplication.rx

import io.reactivex.Scheduler

/**
 *
 * Shared schedulers specification
 *
 */
interface Schedulers {

    fun io(): Scheduler

    fun androidThread(): Scheduler

    fun internet(): Scheduler

}