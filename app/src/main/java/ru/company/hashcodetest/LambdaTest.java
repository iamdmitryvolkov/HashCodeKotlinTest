package ru.company.hashcodetest;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class LambdaTest {

    private final Handler handler = new Handler(Looper.getMainLooper());

    void test() {
        handler.post(this::writeLog);
    }

    private void writeLog() {
        Log.d("LambdaTest", "Hello, lambda");
    }
}
