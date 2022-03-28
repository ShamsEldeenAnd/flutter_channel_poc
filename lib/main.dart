import 'package:flutter/material.dart';
import 'package:flutter_channel_poc/method_channel_fake_cubit.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const TestChannelWidget(),
    );
  }
}

class TestChannelWidget extends StatelessWidget {
  const TestChannelWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Hello Channels"),
      ),
      body: Center(
        child: Column(
          children: [
            TextButton(
              child: const Text("CallPrintTest"),
              onPressed: () {
                MethodChannelFakeCubit.callPrintTestLine();
              },
            ),
            TextButton(
              child: const Text("CallGetValueTest"),
              onPressed: () {
                MethodChannelFakeCubit.callGetTestValue("Flutter Test Value");
              },
            ),
          ],
        ),
      ),
    );
  }
}
