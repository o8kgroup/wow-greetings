# WOW GREETINGS QUEUE COMPOSER
Cria as filas no RabbitMQ

# Getting Started
Execute o comando ```docker-compose up``` dentro da pasta raiz do projeto para subir o RabbitMQ
localmente.

Para acessar a interface gráfica RabbitMq acesse: http://localhost:15672
- Caso esteja usando o MacOs provavelmente será via: http://192.168.99.100:15672

## Importante
Após subir a aplicação não precisar deixar ela executando, ela é usada apenas para criar as
filas, se as filas forem criadas com sucesso após a inicialização está aplicação pode ser parada. 

### Reference Documentation
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-amqp)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)


