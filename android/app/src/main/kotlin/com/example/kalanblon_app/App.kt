package com.example.kalanblon_app

import io.flutter.app.FlutterApplication
//import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService

class App(): FlutterApplication(), PluginRegistrantCallback{
    override fun onCreate() {
        super.onCreate()
        FlutterFirebaseMessagingService.setPluginRegistrant(this)

    }
    override fun registerWith(registry: io.flutter.plugin.common.PluginRegistry?) {
        io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin.registerWith(registry?.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"));
    }
}