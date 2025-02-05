# Use OpenJDK 21 slim image
FROM openjdk:21-slim

# Install required dependencies
RUN apt-get update && apt-get install -y \
    libfreetype6 \
    fontconfig \
    libfontconfig1

# Rest of your Dockerfile remains the same
WORKDIR /app
COPY ../../../Downloads/LivraisonApp-develop/LivraisonApp-develop/billing-service/mvnw .
COPY ../../../Downloads/LivraisonApp-develop/LivraisonApp-develop/billing-service/.mvn .mvn
COPY ../../../Downloads/LivraisonApp-develop/LivraisonApp-develop/billing-service/pom.xml .
COPY ../../../Downloads/LivraisonApp-develop/LivraisonApp-develop/billing-service/src ./src
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
RUN find /app/target -name "*.jar"
ENTRYPOINT ["sh", "-c", "java -jar $(find /app/target -name '*.jar')"]