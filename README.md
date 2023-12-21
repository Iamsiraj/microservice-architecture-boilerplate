# microservice-architecture-boilerplate
Spring Boot 3 | JAVA 17 Microservice Architecture Boilerplate

Tech Stack
Java 17
SpringBoot 3.2.0
Netflix Eureka Service Registry
Netflix Eureka Service Client
Spring Cloud API Gateway
Spring Cloud Config Server
Zipkin
Spring Cloud Sleuth
Open Feign
RabbitMQ
Prometheus
Jitpack
MySQL
Keycloak
Docker / Docker Compose
Kubernetes
Keycloak

need to run keycloak on docker
docker run -p 9090:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:23.0.3 start-dev

keycloak realm name: iamsiraj-microservice-boilerplate-realm
keycloak client name: auth-service
