package com.kafkaconsumer.service;


import com.kafkaconsumer.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaMessageListener {

    Logger logger = LoggerFactory.getLogger(kafkaMessageListener.class);

    @KafkaListener(topics = "customer-topic", groupId = "customer")
    public void consumeCustomerMessage(Customer customer){
        logger.info("Received customer message: {}", customer.toString());

    }

//    @KafkaListener(topics = "consumer-topic", groupId = "consumer")
//    public void consumeMessage1(String message) {
//        logger.info("Consumer-1 received from Kafka topic: {}", message);
//    }
//
//    @KafkaListener(topics = "consumer-topic", groupId = "consumer")
//    public void consumeMessage2(String message) {
//        logger.info("Consumer-2 received from Kafka topic: {}", message);
//    }
//
//    @KafkaListener(topics = "consumer-topic", groupId = "consumer")
//    public void consumeMessage3(String message) {
//        logger.info("Consumer-3 received from Kafka topic: {}", message);
//    }
//
//    @KafkaListener(topics = "consumer-topic", groupId = "consumer")
//    public void consumeMessage4(String message) {
//        logger.info("Consumer-4 received from Kafka topic: {}", message);
//    }
}
