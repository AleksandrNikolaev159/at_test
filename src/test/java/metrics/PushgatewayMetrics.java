package metrics;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Gauge;
import io.prometheus.client.exporter.PushGateway;
import org.testng.ITestResult;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class PushgatewayMetrics {

//        public static void pushTestResultMetric(ITestResult iTestResult,TestMetrics testMetrics) throws IOException {
//
//            Map<String,String> labelsMap = new HashMap<>();
//            labelsMap.put("test_system","my_test_system");
//            labelsMap.put("test_name",iTestResult.getName());
//            CollectorRegistry registry = new CollectorRegistry();
//
//            Gauge testResult = Gauge.build("ui_test_result","Result of the test")
//                            .register(registry);
//            testResult.set(iTestResult.getStatus());
//
//            Gauge testDuration = Gauge.build("test_duration_millis","Duration of the test")
//                    .register(registry);
//            testDuration.set(testMetrics.getTestDuration());
//
//
//            PushGateway pg = new PushGateway("127.0.0.1:9091");
//            pg.push(registry, "ui_test",labelsMap);




//            Gauge testException = Gauge.build()
//                    .name("test_exception")
//                    .help(testMetrics.getTestException())
//                    .labelNames(iTestResult.getName(),"test_system")
//                    .register(CollectorRegistry.defaultRegistry);



//        }

}


