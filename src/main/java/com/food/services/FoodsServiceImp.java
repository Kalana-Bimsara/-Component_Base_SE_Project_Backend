package com.food.services;

import com.food.model.Foods;

import com.food.repo.FoodsRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodsServiceImp implements FoodsService {

    @Resource
    private FoodsRepository foodRepository;


    @Override
    public List<Foods> getAllFoods() {
        return foodRepository.findAll();
    }
}

