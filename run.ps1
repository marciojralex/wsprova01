mvn clean install package
docker build -t wsprova/jdk -f Dockerfile .
docker create --name ws -p 8080:8080 -it wsprova/jdk 
docker start ws 