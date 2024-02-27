# bank-application
This reposiroty highlights my online bank application with multiple functionalities of transfer of money, account creation, transactions..

## Microservices Architecture 

![alt text](http://url/to/img.png)

The Architecture consists of two functional microservices: account-service and customer service, and also three technical microservices: Gateway-service, Discovery-service and Config-service. Each microservice is attached to its own Postgres database for data storage. The microservices are secured throught the Gateway-service using Keycloak server and OAuth 2.0 protocol.

## Technology Stack
- Spring Eco-system (Spring Boot, Cloud, Data, Security) version 3
- Angular version 16
- Docker
- Kubernetes
- Keycloak
