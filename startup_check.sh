#!/bin/bash

# Переход в каталог /root/metrics
cd /home/aleksandr/IdeaProjects/at_tests;

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется startup_check.sh"

# Ожидание, пока контейнеры поднимутся (максимум 60 секунд)
for i in {1..60}; do
    if docker-compose ps --services --filter "status=running" | grep -q "influxdb" && \
       docker-compose ps --services --filter "status=running" | grep -q "grafana"; then
        break
    fi
    sleep 1
done

# Вывод информации о контейнерах для отладки
docker-compose ps

# Проверка статуса контейнера grafana
if docker-compose ps --services --filter "status=running" | grep -q "grafana"; then
    # Проверка статуса контейнера influxdb
    if docker-compose ps --services --filter "status=running" | grep -q "influxdb"; then
        echo "Контейнеры grafana и influxdb запущены."
        docker exec influxdb sh /var/lib/influxdb_data/user_active.sh
    else
        echo "Контейнер influxdb не найден или не запущен. Запуск start.sh..."
        sh /home/aleksandr/IdeaProjects/at_tests/start.sh
    fi
else
    echo "Контейнер grafana не найден или не запущен. Запуск start.sh..."
    sh /home/aleksandr/IdeaProjects/at_tests/start.sh
fi
