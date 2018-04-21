#!/bin/bash

set -e -u -x -o

scp jar/dijkstra-api.jar target:jar/ 

ssh target sudo systemctl restart dijkstra-api
