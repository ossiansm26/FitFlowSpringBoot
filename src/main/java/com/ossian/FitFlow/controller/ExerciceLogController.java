package com.ossian.FitFlow.controller;

import com.ossian.FitFlow.model.ExerciceLog;
import com.ossian.FitFlow.serviceImpl.ExerciceLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exerciceLog")
@CrossOrigin(origins = "http://localhost:8080")
public class ExerciceLogController {
    @Autowired
    private ExerciceLogServiceImpl exerciceLogService;

    @GetMapping("/getAllExerciceLog")
    public ResponseEntity<List<ExerciceLog>> getAllExerciceLog() {
        List<ExerciceLog> exerciceLog = exerciceLogService.getAllExerciceLog();
        return ResponseEntity.ok(exerciceLog);
    }
    @PostMapping("/create")
    public ResponseEntity<ExerciceLog> createExerciceLog(@RequestBody ExerciceLog exerciceLog) {
        ExerciceLog newExerciceLog = exerciceLogService.saveExerciceLog(exerciceLog);
        return ResponseEntity.ok(newExerciceLog);
    }


}
