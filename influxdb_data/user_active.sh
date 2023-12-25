#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется user_active.sh"

# Проверка активности пользователя influx
if influx auth list | grep -q "authorizations"; then
    echo "Пользователь influx активен. Запуск backup.sh..."
    sh /var/lib/influxdb_data/backup.sh;
else
    echo "Пользователь influx не активен. Запуск init.sh..."
    sh /var/lib/influxdb_data/init.sh;
fi

