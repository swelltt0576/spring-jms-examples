package org.bsnyder.spring.jms.adapter;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageDelegateImpl implements MessageDelegate {
    
    private static final Logger LOG = LoggerFactory.getLogger(MessageDelegateImpl.class);
    
    public void handleMessage(TextMessage message) {
        try {
            LOG.info("Consumed text message number {}", message.getIntProperty("messageCount"));
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        }
    }
    
    public void handleMessage(BytesMessage message) {
        try {
            LOG.info("Consumed bytes message number {}", message.getIntProperty("messageCount"));
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        }
    }
    
    public void handleMessage(MapMessage message) {
        try {
            LOG.info("Consumed map message number {}", message.getIntProperty("messageCount"));
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        }
    }
    
    public void handleMessage(ObjectMessage message) {
        try {
            LOG.info("Consumed object message number {}", message.getIntProperty("messageCount"));
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        }
    }
}
