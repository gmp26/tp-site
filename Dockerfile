FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/tp-site.jar /tp-site/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/tp-site/app.jar"]
