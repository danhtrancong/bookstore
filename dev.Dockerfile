FROM tomcat:8.0-jre8

COPY /target/bookstore.war /usr/local/tomcat/webapps/bookstore.war

ENV JPDA_ADDRESS="8787"

ENV JPDA_TRANSPORT="dt_socket"

CMD ["catalina.sh", "jpda", "run"]

EXPOSE 8080 8787