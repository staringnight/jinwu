FROM harbor.dazhi100.com/docker-hub/library/openjdk:17.0.2-oracle

VOLUME /dzyx/ /dzyx/

WORKDIR /dzyx/service

COPY /target/student-web-1.0.0-SNAPSHOT.jar /dzyx/service/

ENV JAVA_OPTS "-server -Xmx2g -Xms512m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/dzyx/dump/"

EXPOSE 6081

RUN bash -c 'touch /dzyx/service/student-web-1.0.0-SNAPSHOT.jar'

ENTRYPOINT java $JAVA_OPTS --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/sun.net.util=ALL-UNNAMED --enable-preview -jar student-web-1.0.0-SNAPSHOT.jar




