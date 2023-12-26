#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется startup_check.sh"

# Переход в каталог /root/metrics
cd /root/metrics;

sleep 5;
# Проверка, запущен ли контейнер Grafana
if [ -z "$(docker-compose ps -q grafana)" ] || [ -z "$(docker ps -q --no-trunc | grep $(docker-compose ps -q grafana))" ] || \
   [ -z "$(docker-compose ps -q influxdb)" ] || [ -z "$(docker ps -q --no-trunc | grep $(docker-compose ps -q influxdb))" ]; then
  echo "Один из контейнеров (Grafana или InfluxDB) не запущен. Перезапуск...";
  sh /root/metrics/start.sh;
else
  echo "Оба контейнера (Grafana и InfluxDB) уже запущены"
  docker exec influxdb sh /var/lib/influxdb_data/user_active.sh;
fi
