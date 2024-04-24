package com.example.techordatrello.service;

import com.example.techordatrello.model.TaskCategories;
import com.example.techordatrello.repository.TaskCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskCategoriesService {
    @Autowired
    private TaskCategoriesRepository taskCategoriesRepository;

    public List<TaskCategories> getAllTaskCategories() {
        return taskCategoriesRepository.findAll();
    }

}