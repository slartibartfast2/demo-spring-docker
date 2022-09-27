We can create a docker image for our app and run like below;

    docker build -t slartibartfast/demo-spring-boot-on-kubernetes .
    
    docker run -d -p8099:8099 -e "SPRING_PROFILES_ACTIVE=docker" --name demo-spring-docker slartibartfast/demo-spring-docker