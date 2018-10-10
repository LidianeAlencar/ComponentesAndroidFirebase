package br.com.nextr.componentesandroid

import android.app.IntentService
import android.content.Intent
import android.util.Log

class NotificationService : IntentService(""){
    override fun onHandleIntent(intent: Intent?) {
        val msg = intent?.getStringExtra("Teste")
        val msg2 = intent?.getStringExtra("Teste")
        Log.i("MSG", msg)
        Log.i("MSG", msg2)
    }
}