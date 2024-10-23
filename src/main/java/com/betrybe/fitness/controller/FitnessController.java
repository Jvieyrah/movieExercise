package com.betrybe.fitness.controller;

import com.betrybe.fitness.dto.WorkoutCreationDto;
import com.betrybe.fitness.dto.WorkoutDto;
import com.betrybe.fitness.service.FitnessService;
import com.betrybe.fitness.service.FitnessServiceInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class.
 */
@RestController
@RequestMapping("/fitness")
public class FitnessController implements FitnessControllerInterface {
  FitnessServiceInterface fitnessService;

  @Autowired
  public FitnessController(FitnessServiceInterface fitnessService) {
    this.fitnessService = fitnessService;
  }

  @GetMapping
  public String  getRoot()  {
    return "Boas vindas à API de Fitness!";
  }

  /**
   * Get workout by id.
   * param
   *
   */
  @GetMapping("/workouts/{id}")
  public ResponseEntity<Optional<WorkoutDto>> getWorkout(@PathVariable Long id) {
    Optional<WorkoutDto> workoutId = fitnessService.getWorkout(id);
    if (workoutId.isEmpty()) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(workoutId);
  }

  @GetMapping("/workouts")
  public ResponseEntity<List<WorkoutDto>> getAllWorkouts() {
    List<WorkoutDto> workouts = fitnessService.getAllWorkouts();
    return ResponseEntity.ok(workouts);
  }

  @PostMapping("/workouts")
  public ResponseEntity<WorkoutDto> saveWorkout(@RequestBody WorkoutCreationDto newWorkoutDto) {
    WorkoutDto workout = fitnessService.saveWorkout(newWorkoutDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(workout);
  }
}
