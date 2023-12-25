#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется init.sh"
# Ждем 10 секунд перед выполнением команды
sleep 10

# Используем "yes" для автоматического подтверждения "y"
yes | influx setup \
    --token=CbnzBUNDSmaBdNuIpEKUXiSnLUACnRP0lV7zM8CVhBDgp4zLApJnpFEbSmqXtUruj22mcmUUe_1MkW6gwqcFqA== \
    --username=admin \
    --password=pgatu777 \
    --org=home \
    --bucket=tt \
    -retention=0;

influx bucket delete -n tt;

sh /var/lib/influxdb_data/restore.sh


