#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется backup.sh"

# Очищаем папку перед бэкапом
rm -rf /var/backups/*

influx backup \
    /var/backups \
    -t CbnzBUNDSmaBdNuIpEKUXiSnLUACnRP0lV7zM8CVhBDgp4zLApJnpFEbSmqXtUruj22mcmUUe_1MkW6gwqcFqA==

