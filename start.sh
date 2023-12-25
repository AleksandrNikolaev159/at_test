#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется start.sh"

# Проверка запущен ли сервис Docker
if ! sudo systemctl is-active --quiet docker; then
    echo "Сервис Docker не запущен. Запуск sudo systemctl start docker..."
    sudo systemctl start docker
fi

# Переход в каталог /root/metrics
cd /home/aleksandr/IdeaProjects/at_tests;

# Поднятие docker-compose
sudo docker-compose up -d;

# Ожидание, пока все контейнеры поднимутся (максимум 60 секунд)
for i in {1..60}; do
    if sudo docker-compose ps --services --filter "status=running" | grep -E "grafana|influxdb"; then
        break
    fi
    sleep 1
done

sh /home/aleksandr/IdeaProjects/at_tests/startup_check.sh;
