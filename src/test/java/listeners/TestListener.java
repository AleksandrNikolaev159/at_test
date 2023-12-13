package listeners;

import com.influxdb.client.write.Point;
import metrics.InfluxDbSender;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener implements ITestListener {

    static final String bucket = "test_metrics";
    static final char [] influxDbToken  = "BHak4kCSEgJsX7pDJ2dvT4V-otW0ZWsmtWwNHWgB2rzkiLEWVKd8fqWBrVBfdcefj9E-fTaOJJhKii1n8L5syg==".toCharArray();


    public void onTestSuccess(ITestResult iTestResult) {
        try {
            this.sendInfluxDbMetrics(iTestResult, "PASS");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void onTestFailure(ITestResult iTestResult) {
        try {
            this.sendInfluxDbMetrics(iTestResult, "FAIL");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {
        try {
            this.sendInfluxDbMetrics(iTestResult, "SKIPPED");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sendInfluxDbMetrics(ITestResult iTestResult, String status) throws IOException {

        Point point = Point
                .measurement("testmethod")
                .addField("status",status)
                .addField("name",iTestResult.getName())
                .addTag("name", iTestResult.getName());

        InfluxDbSender.send(point);
    }


}
