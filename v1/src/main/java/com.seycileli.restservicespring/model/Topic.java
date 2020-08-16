package com.seycileli.restservicespring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String topicId;
    private String topicName;
    private String topicDescription;

    public Topic() { }

    public Topic(String topicId, String topicName, String topicDescription) {
        super();
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
}
