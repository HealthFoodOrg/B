package com.example.healthfood.application.service;

import com.example.healthfood.application.dto.FoodDTO;
import com.example.healthfood.domain.model.Food;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-26T01:18:32-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class FoodMapperImpl implements FoodMapper {

    @Override
    public FoodDTO foodToFoodDTO(Food food) {
        if ( food == null ) {
            return null;
        }

        FoodDTO foodDTO = new FoodDTO();

        return foodDTO;
    }

    @Override
    public Food foodDTOToFood(FoodDTO foodDTO) {
        if ( foodDTO == null ) {
            return null;
        }

        Food food = new Food();

        return food;
    }
}
