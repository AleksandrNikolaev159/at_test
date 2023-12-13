***Приложение для демонстрации навыков автоматизации тестирования***
-----------------------------------
-----------------------------------
***Используемые библиотеки:***
-----------------------------------
- selenium
- testng
- okhttp
- selenide
- swagger-parser
- gson

***Тестирование UI :***<br>
В качестве тестируемого приложения используется
"https://www.google.com/" <br>
Предварительно необходимо инсталировать актуальную 
версию chromedriver соответствующую версии вашего браузера Google Chrome

 ***
***Тестирование API :***
В качестве тестируемого приложения используется  
https://github.com/AleksandrNikolaev159/rest-api <br>
Предварительно необходимо поднять данное приложение с помощью docker-compose
(Инструкция по запуску интерфейса расположена в файле README.md в корне проекта)<br>
Просмотр документации Swagger
http://localhost:8081/swagger-ui/index.html#/

***Генерация клиента с помощью openapi-generator-cli:***
npx @openapitools/openapi-generator-cli generate -i src/test/java/resources/output.json -g java -o target/generated-sources/openapi-generator

