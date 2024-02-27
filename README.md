# bank-application
This reposiroty highlights my online bank application with multiple functionalities of transfer of money, account creation, transactions..

## Microservices Architecture 

![alt text](file:///home/youssef/Downloads/architecture%20microservice%20bancaire.drawio.svg)

The Architecture consists of two functional microservices: account-service and customer service, and also there are three technical microservices: Gateway-service, Discovery-service and Config-service. Each microservice is attached to its own Postgres database for data storage. THe microservices communicate via OpenFeign Framework and are secured throught the Gateway-service using Keycloak server and OAuth 2.0 protocol.

## Technology Stack
- Spring Eco-system (Spring Boot, Cloud, Data, Security) version 3
- Angular version 16
- Docker
- Kubernetes
- Keycloak 
