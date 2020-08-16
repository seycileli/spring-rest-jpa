package com.seycileli.restservicespring.service;

import com.seycileli.restservicespring.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    /*
    In order to edit and add on to our List, we'll have to
    make our ArrayList mutable, which is simple.

    List<ClassNameHere> variableName = new ArrayList<>
    (Arrays.asList( -> call the constructor class from here and that's it.
     */
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("Mobile and Web Development",
                        "Front-End Web Development with React",
                        "This course explores Javascript based front-end application development, " +
                                "and in particular the React library "),

                new Topic("Design and Product",
                        "Agile Meets Design Thinking",
                        "Agile and design thinking offer a different--and " +
                                "effective--approach to product development, one that results in valuable solutions " +
                                "to meaningful problems"),

                new Topic("Philosophy",
                        "Introduction to Philosophy",
                        "understand what philosophy is – what are its characteristic aims and methods")));


    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getTopicId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        /* loop through topics list, and will compare id from input to id that is in list
        if it is a match, then in that location we will update our topic(s) by using
        the set method */
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getTopicId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getTopicId().equals(id));
    }
}
