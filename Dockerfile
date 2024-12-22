FROM openjdk:latest

WORKDIR /app

COPY LargeDigit.java .

RUN javac LargeDigit.java

CMD ["java","LargeDigit"]

