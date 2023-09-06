package metrics;

public class TestMetrics {

    private String testResult;

    private long testDuration;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public long getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(long testDuration) {
        this.testDuration = testDuration;
    }

    public TestMetrics(String testResult, long testDuration) {
        this.testResult = testResult;
        this.testDuration = testDuration;
    }
}
