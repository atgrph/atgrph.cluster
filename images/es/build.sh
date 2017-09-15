#!/usr/bin/env bash

if [ $# -eq 0 ]
  then
    tag='latest'
  else
    tag=$1
fi

imageName=autograph/elasticsearch:$tag

NORMAL='\033[0m'
MAGENTA='\033[0;35m'
BOLD='\033[1m'
echo -e "${MAGENTA}Image name: ${BOLD}$imageName ${NORMAL}"

docker build -t $imageName .