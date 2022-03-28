package com.flutterchannel.poc.flutter_channel_poc
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        // Use the GeneratedPluginRegistrant to add every plugin that's in the pubspec.
        GeneratedPluginRegistrant.registerWith(flutterEngine)

        /// configure method channel
        FlutterChannelConfiguration(flutterEngine).configureMethodChannel()
    }
}
