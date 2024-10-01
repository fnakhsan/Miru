package com.ppl.miru

import android.app.Application
import com.ppl.miru.logging.CrashAndLog
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MiruApp : Application() {
    override fun onCreate() {
        super.onCreate()
        CrashAndLog.setupTimber()
        startKoin {
            androidLogger()
            androidContext(this@MiruApp)
        }
    }
}

