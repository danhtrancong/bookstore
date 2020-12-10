FROM frekele/maven:3.5.3-jdk8 as maven

RUN mkdir -p /build
WORKDIR /build
COPY ./ .

RUN cd /build

RUN mvn clean package -T1C

FROM tomcat:8.0-jre8

COPY --from=maven /build/target/bookstore.war /usr/local/tomcat/webapps/bookstore.war

CMD ["catalina.sh", "run"]

EXPOSE 8080