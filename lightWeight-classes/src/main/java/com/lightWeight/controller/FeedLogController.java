package com.lightWeight.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lightWeight.model.FeedLog;
import com.lightWeight.repository.FeedLogRepository;

@RestController
@RequestMapping("/api/manageFeed")
public class FeedLogController {
	@Autowired
    private FeedLogRepository feedLogRepository;

    @GetMapping
    public List<FeedLog> getAllTweets() {
        return feedLogRepository.findAll();
    }

    @GetMapping("/{id}")
    public FeedLog getFeedLogById(@PathVariable Integer id) {
        return feedLogRepository.findById(id).orElse(null);
    }

    @PostMapping
    public FeedLog createFeedLog(@RequestBody FeedLog feedLog) {
    	feedLog.setPostTime(new Date());
        return feedLogRepository.save(feedLog);
    }

    @PutMapping("/{id}")
    public FeedLog updateTweet(@PathVariable Integer id, @RequestBody FeedLog updatedFeedLog) {
    	FeedLog existingFeedLog = feedLogRepository.findById(id).orElse(null);

        if (existingFeedLog != null) {
            // Remova a linha que define postTime para a hora atual
        	existingFeedLog.setMidaContent(existingFeedLog.getMidaContent());
        	existingFeedLog.setIdCreator(existingFeedLog.getIdCreator());
            // Mantenha a hora original do tweet
            return feedLogRepository.save(existingFeedLog);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTweet(@PathVariable Integer id) {
        feedLogRepository.deleteById(id);
    }
}
