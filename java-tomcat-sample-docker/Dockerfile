FROM tomcat:8.0
RUN pwd
ADD **/*.war /usr/local/tomcat/webapps/
RUN cp -a **/*.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]