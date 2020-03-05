## Run the App

1. `docker-compose up -d`
2. Run the Springboot App
3. Produce a message to the `data` topic
  - enter the docker image kafka: `docker exec -it kafka bash`
  - `kafka-console-producer --broker-list kafka:9092 --topic data`
    - this will enter in a promp mode where you can type the json message
        `{"key": "my-key", "value1": "my-value-1", "value2": "my-value-2"}`
  
> If an invalid message is sent to the topic the consumer will get stuck trying to deserialize the 
> message and will not commit its offset, to handle that properly look for ErrorHandlingDeserializer2 in spring-kafka docs
