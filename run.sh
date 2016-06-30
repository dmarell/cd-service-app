#!/usr/bin/env bash
docker build -t cd-service-app .
docker rm -f cd-service-app &> /dev/null || true
docker run \
   -d --name cd-service-app \
   -p 8080:8080 \
   cd-service-app