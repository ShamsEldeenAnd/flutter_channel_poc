package com.flutterchannel.poc.flutter_channel_poc

import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class FlutterChannelConfiguration(private val flutterEngine: FlutterEngine) {

    /// current test channel name
    val MY_TEST_CHANNEL = "MY_TEST_CHANNEL"

    val PRINT_LINE = "printTestLine"
    val GET_VALUE = "getTestValue"

    fun configureMethodChannel() {
        MethodChannel(
            flutterEngine.dartExecutor,
            MY_TEST_CHANNEL
        ).setMethodCallHandler { call, result ->

            when (call.method) {
                PRINT_LINE -> {
                    TestMethodsHolder.printTestLine()
                }
                GET_VALUE -> {
                    /// call args example with return value from kotlin - side
                    if (call.hasArgument("testValue")) {
                        /// [success] used when u want to send args back to flutter
                        result.success(TestMethodsHolder.getTestValue(call.argument<String>("testValue")!!))
                    }
                }
            }
        }
    }


}