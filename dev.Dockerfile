FROM tomcat:8.0-jre8

COPY /target/bookstore.war /usr/local/tomcat/webapps/bookstore.war

CMD ["catalina.sh", "run"]

EXPOSE 8080