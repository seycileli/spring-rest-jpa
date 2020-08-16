package com.seycileli.restservicespring.controller;

import com.seycileli.restservicespring.model.Topic;
import com.seycileli.restservicespring.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    private final TopicService topicService;

    @Autowired //constructor injected
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        //for specific topic
        return topicService.getTopic(id);
    }

    /*
    Map any Request that is a GET, /topics
    GET is the default, which is why it is not specified within our param

    @GetMapping would simplify this
    */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        //to get all topics
        return topicService.getAllTopics();
    }

    /*
    RequestMethod with POST value is used to specify what the method should be
    - Map this method to any Request that is a POST -
    - slash our URL, which in this case being topics

    @RequestBody, we're telling Spring to get the instance of Topic

    @PostMapping would simplify this
     */
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    //@PutMapping would simplify this
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    //@DeleteMapping would simplify this
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
