We can create a docker image for our app and run like below;

    docker build -t slartibartfast/demo-spring-docker .
    
    docker run -d -p8099:8099 -e "SPRING_PROFILES_ACTIVE=docker" --name demo-spring-docker slartibartfast/demo-spring-docker

You can build docker image with buildpack support too like below

    mvn spring-boot:build-image -Dspring-boot.build-image.imageName=slartibartfast/demo-spring-docker