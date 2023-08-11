package org.example;

public class TestMetrics {

    private String testResult;

    private double testDuration;

    private String testException;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public double getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(double testDuration) {
        this.testDuration = testDuration;
    }

    public String getTestException() {
        return testException;
    }

    public void setTestException(String testException) {
        this.testException = testException;
    }

    public TestMetrics(String testResult, double testDuration, String testException) {
        this.testResult = testResult;
        this.testDuration = testDuration;
        this.testException = testException;
    }
}
