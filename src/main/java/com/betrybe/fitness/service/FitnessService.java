package com.betrybe.fitness.service;

import com.betrybe.fitness.database.FakeFitnessDatabase;
import com.betrybe.fitness.dto.WorkoutCreationDto;
import com.betrybe.fitness.dto.WorkoutDto;
import com.betrybe.fitness.model.Workout;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class.
 */
@Service
public class FitnessService implements FitnessServiceInterface {
  private final FakeFitnessDatabase fakeFitnessDatabase;

  @Autowired
  public FitnessService(FakeFitnessDatabase fakeFitnessDatabase) {
    this.fakeFitnessDatabase = fakeFitnessDatabase;
  }

  @Override
  public WorkoutDto saveWorkout(WorkoutCreationDto newWorkoutDto) {
    Workout newWorkout = convertToWorkout(newWorkoutDto);
    Workout savedWorkout = this.fakeFitnessDatabase.saveWorkout(newWorkout);
    return convertToDto(Optional.of(savedWorkout));
  }

  @Override
  public Optional<WorkoutDto> getWorkout(Long id) {
    Optional<Workout> idedWorkout = this.fakeFitnessDatabase.getWorkout(id);
    if (idedWorkout.isEmpty()) {
      return Optional.empty();
    }

    WorkoutDto workoutDto = convertToDto(idedWorkout);

    return Optional.of(workoutDto);
  }

  private static WorkoutDto convertToDto(Optional<Workout> idedWorkout) {
    Workout workout = idedWorkout.get();

    return new WorkoutDto(
        workout.getId(),
        workout.getName(),
        workout.getRepetitions()
    );
  }

  private static Workout convertToWorkout(WorkoutCreationDto newWorkoutDto) {
    Workout workout = new Workout();
    workout.setName(newWorkoutDto.name());
    workout.setRepetitions(newWorkoutDto.repetitions());
    workout.setSecretTechnique(newWorkoutDto.secretTechnique());
    return workout;
  }

  @Override
  public List<WorkoutDto> getAllWorkouts() {
    List<Workout> workouts = this.fakeFitnessDatabase.getAllWorkouts();
    return workouts.stream().map(workout -> convertToDto(Optional.of(workout)
    )).toList();
  }
}


