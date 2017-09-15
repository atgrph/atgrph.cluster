FROM elasticsearch:2.4.4-alpine
MAINTAINER Bukharov Sergey <bukharovSI@gmail.com>

ADD boosted_search.groovy /usr/share/elasticsearch/config/scripts/boosted_search.groovy
ADD person_sorting.groovy /usr/share/elasticsearch/config/scripts/person_sorting.groovy

RUN mkdir /usr/share/elasticsearch/config/synonyms
ADD name.txt /usr/share/elasticsearch/config/synonyms/name.txt
