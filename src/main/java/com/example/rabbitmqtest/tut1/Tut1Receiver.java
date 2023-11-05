package com.example.rabbitmqtest.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author Gary Russell
 * @author Scott Deeg
 * @author Wayne Lund
 */
@RabbitListener(queues = "hello")
public class Tut1Receiver {

  @RabbitHandler
  public void receive(String in) {
    System.out.println(" [x] Received '" + in + "'");
  }

}