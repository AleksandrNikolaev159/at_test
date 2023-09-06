package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener implements ITestListener {

    public void onTestSuccess(ITestResult iTestResult) {
//        try {
//            this.sendTestMethodStatus(iTestResult, "PASS");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }


    public void onTestFailure(ITestResult iTestResult) {
//        try {
//            this.sendTestMethodStatus(iTestResult, "FAIL");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void onTestSkipped(ITestResult iTestResult) {
//        try {
//            this.sendTestMethodStatus(iTestResult, "SKIPPED");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }


//    private void sendTestMethodStatus(ITestResult iTestResult, String status) throws IOException {
//
//        String testResult = status;
//
//        long testDuration = iTestResult.getEndMillis() - iTestResult.getStartMillis();
//
//        String testException = String.valueOf(iTestResult.getThrowable());
//
//        TestMetrics testMetrics = new TestMetrics(testResult,testDuration);
//
//        PushgatewayMetrics.pushTestResultMetric(iTestResult, testMetrics);
//
//        System.out.println("Result of test " + iTestResult.getName() + " = " + status);
//
//    }

}
