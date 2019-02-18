package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserMealsUtil {
    public static List<UserMealWithExceed> getFilteredWithExceeded(Collection<UserMealWithExceed> meals, LocalDateTime startTime, LocalDateTime endTime) {
        return meals.stream()
                .filter(meal -> meal.getDateTime().isAfter(startTime) && meal.getDateTime().isBefore(endTime))
                .collect(Collectors.toList());
    }
}
