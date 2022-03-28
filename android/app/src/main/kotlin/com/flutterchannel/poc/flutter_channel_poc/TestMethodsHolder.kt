package com.flutterchannel.poc.flutter_channel_poc

import android.util.Log

class TestMethodsHolder {
    companion object{
        private const val TAG = "TestMethodsHolder"
        fun printTestLine(){
            Log.d(TAG, "Here is Print From Kotlin !!!!")
        }

        fun getTestValue(testValue  :String ) : String {
            return  "Here is Test Value From Kotlin $testValue"
        }
    }
}