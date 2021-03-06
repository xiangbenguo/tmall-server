FROM urbansitter/alpine-oraclejdk8-google-cloud-sdk

ADD target/tmall-server.jar /app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]