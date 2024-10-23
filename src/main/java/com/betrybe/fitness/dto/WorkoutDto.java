package com.betrybe.fitness.dto;

/**
 * DTO class.
 */
public record WorkoutDto(
    Long id,
    String name,
    Integer repetitions
) {

}
