import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

class MethodChannelFakeCubit {
  static const myTestChannel = MethodChannel("MY_TEST_CHANNEL");

  static const String PRINT_LINE = "printTestLine";
  static const String GET_VALUE = "getTestValue";
  static const String NATIVE_VIEW = "nativeView";

  /// call print line method should print ----> Here is Print From Kotlin !!!!
  static void callPrintTestLine() async {
    try {
      await myTestChannel.invokeMethod(PRINT_LINE);
    } catch (e) {
      debugPrint("Error cause of $e");
    }
  }

  /// call get value from test should return Here is Test Value From Kotlin + [testValue]
  static void callGetTestValue(String testValue) async {
    try {
      String kotlinTestValue =
          await myTestChannel.invokeMethod(GET_VALUE, {"testValue": testValue});
      debugPrint("Print From Flutter : $kotlinTestValue");
    } catch (e) {
      debugPrint("Error cause of $e");
    }
  }

  /// call get value from test should return Here is Test Value From Kotlin + [testValue]
  static void navigateToNativeView(String bookUrl) async {
    try {
      myTestChannel.invokeMethod(NATIVE_VIEW, {"bookUrl": bookUrl});
    } catch (e) {
      debugPrint("Error cause of $e");
    }
  }
}
