
# RabbitMQ sandbox



[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](http://gitpod.io/#https://github.com/sudeepcv/spring-cloud-microservice-docker)



This is a simple RabbitMQ sandbox .

you could run this project using docker:


docker-compose up -d  

to log :

docker-compose logs -f

to stop:

docker-compose down -v

api:

http://localhost:8080/api/v1/orders

payload:
{
"name":"cvs order45",
"qty":4,
"price":100
}

RabbitMQ management:

http://localhost:15672/