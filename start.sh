#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется start.sh"

# Переход в каталог /root/metrics
cd /root/metrics;

# Поднятие docker-compose
docker-compose down;

docker-compose up -d;

sh /root/metrics/startup_check.sh;
