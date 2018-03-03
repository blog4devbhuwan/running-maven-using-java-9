#!/usr/bin/env bash
mvn clean install
cd app
mvn exec:exec