package metrics;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.WriteApiBlocking;
import com.influxdb.client.write.Point;

public class InfluxDbSender {
    static final char []  newToken = "".toCharArray();
    static final char [] influxDbToken  = "CbnzBUNDSmaBdNuIpEKUXiSnLUACnRP0lV7zM8CVhBDgp4zLApJnpFEbSmqXtUruj22mcmUUe_1MkW6gwqcFqA==".toCharArray();
    static final String influxDbUrl = "https://192.168.0.11:8086/";
    static final String bucket = "test_metrics";
    static final String org = "home";

    public static void send(Point point){

        InfluxDBClient client = InfluxDBClientFactory.create(influxDbUrl, influxDbToken);

        WriteApiBlocking writeApi = client.getWriteApiBlocking();

        writeApi.writePoint(bucket, org, point);

    }
}
