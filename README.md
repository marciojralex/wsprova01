Para rodar o projeto basta usar o comando "java -jar webservice-1.jar" que iniciará no tomcat embarcado.

Criei o arquivo de dockerfile para caso queiram rodar o sistema no docker.
Também criei arquivos para criar e iniciar o container (run) e um arquivo para parar e deletar o container (stop).
Os arquivos foram criados com para rodar no windowns (.ps1) e linux (.sh)

O WebService está rodando com banco de dados H2 embarcado.

No projeto coloquei a Collection do Postman com os request´s.