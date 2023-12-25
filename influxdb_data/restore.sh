#!/bin/bash

echo "$(date +'%Y-%m-%d %H:%M:%S') Выполняется restore.sh"

sleep 10

influx restore \
    /var/backups \
    -t CbnzBUNDSmaBdNuIpEKUXiSnLUACnRP0lV7zM8CVhBDgp4zLApJnpFEbSmqXtUruj22mcmUUe_1MkW6gwqcFqA==




