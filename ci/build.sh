#!/bin/bash

set -e -u -x -o

mvn clean package -f repo/pom.xml

mv repo/target/dijkstra-api.jar jar/
