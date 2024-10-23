package com.betrybe.fitness.dto;

/**
 * DTO class.
 */
public record WorkoutCreationDto(
    String name,
    Integer repetitions,
    String secretTechnique
) {

}
