package org.example;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Gauge;
import io.prometheus.client.exporter.PushGateway;
import org.testng.ITestResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PushgatewayMetrics {

        public static void pushTestResultMetric(ITestResult iTestResult,TestMetrics testMetrics) throws IOException {

            Map<String,String> labelsMap = new HashMap<>();
            labelsMap.put("test_system","my_test_system");
            labelsMap.put("test_name",iTestResult.getName());
            CollectorRegistry registry = new CollectorRegistry();

            Gauge testResult = Gauge.build("ui_test_result","Result of the test")
                            .labelNames("result")
                            .register(registry);
            testResult.labels(testMetrics.getTestResult());

            Gauge testDuration = Gauge.build("ui_test_duration","Duration of the test")
                    .labelNames("duration")
                    .register(registry);
            testDuration.set(testMetrics.getTestDuration());

            PushGateway pg = new PushGateway("127.0.0.1:9090");
            pg.push(registry, "ui_test",labelsMap);

            //pg.pushAdd(CollectorRegistry.defaultRegistry, "ui_test");

//            Gauge testDuration = Gauge.build()
//                    .name("test_duration")
//                    .help("Duration of the test")
//                    .labelNames(iTestResult.getName(),"test_system")
//                    .register(CollectorRegistry.defaultRegistry);
//            testDuration.set(testMetrics.getTestDuration());

//            Gauge testException = Gauge.build()
//                    .name("test_exception")
//                    .help(testMetrics.getTestException())
//                    .labelNames(iTestResult.getName(),"test_system")
//                    .register(CollectorRegistry.defaultRegistry);



        }

}


