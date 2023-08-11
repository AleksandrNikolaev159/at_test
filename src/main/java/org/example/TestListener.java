package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.IOException;

public class TestListener implements ITestListener {

    public void onTestSuccess(ITestResult iTestResult) {
        try {
            this.sendTestMethodStatus(iTestResult, "PASS");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendTestMethodStatus(ITestResult iTestResult, String status) throws IOException {

        String testResult = status;

        long duration = iTestResult.getEndMillis() - - iTestResult.getStartMillis();

        double testDuration = (double) duration;

        String testException = String.valueOf(iTestResult.getThrowable());

        TestMetrics testMetrics = new TestMetrics(testResult,testDuration,testException);

        PushgatewayMetrics.pushTestResultMetric(iTestResult, testMetrics);

        System.out.println(testDuration);

    }



//    public void onTestSuccess(ITestResult tr) {
//        try {
//
//            PushgatewayMetrics.pushTestResultMetric(tr);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }






}
