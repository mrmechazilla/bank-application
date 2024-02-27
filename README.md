# bank-application
This reposiroty highlights my online bank application with multiple functionalities of transfer of money, account creation, transactions..

## Microservices Architecture 

![alt text](https://drive.google.com/file/d/1iXuTDcHZn7Zafv-fYTDG-SPYEriA15GJ/view?usp=sharing)

The Architecture consists of two functional microservices: account-service and customer service, and also there are three technical microservices: Gateway-service, Discovery-service and Config-service. Each microservice is attached to its own Postgres database for data storage. THe microservices communicate via OpenFeign Framework and are secured throught the Gateway-service using Keycloak server and OAuth 2.0 protocol.

## Technology Stack
- Spring Eco-system (Spring Boot, Cloud, Data, Security) version 3
- Angular version 16
- Docker
- Kubernetes
- Keycloak 
