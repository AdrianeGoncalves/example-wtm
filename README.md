# Example-WTM

# Requisitos para instalação

    1 - Java - 1.8
    2 - MySQL - 5.x.x
    3 - Maven

1 - Clone a aplicação 

  ```git clone https://github.com/AdrianeGoncalves/example-wtm.git```

2 -  Crie o banco de dados no MySQL

    ```create database example_wtm```
  
3. Modifique o username e password no arquivo abaixo de acordo com as credenciais do seu banco de dados

    Abrir ```src/main/resources/application.properties```

    Modificar ```spring.datasource.username``` and ```spring.datasource.password``` 

4. Executar a aplicação

    ```mvn spring-boot:run``` ou importe o projeto em uma IDE (Intelijj ou Eclipse) e execute a aplicação

Acesse - http://localhost:8080
