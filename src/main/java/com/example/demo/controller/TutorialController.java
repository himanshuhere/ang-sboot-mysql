package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Tutorial;
import com.example.demo.repository.TutorialRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {
	@Autowired
	TutorialRepository tutorialRepository;
	
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
		return null;
	}
	
	@GetMapping("/tutorial/{id}")
	public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id){
		return null;
	}
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial){
		return null;
	}
	
	@PutMapping("/tutorial/{id}")
	public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial){
		return null;
	}
	
	@DeleteMapping("/tutorials")
	public ResponseEntity<HttpStatus> deleteAllTutorials(){
		return null;
	}
	
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id){
		return null;
	}
	
	@GetMapping("/tutorial/published")
	public ResponseEntity<List<Tutorial>> findByPublished(){
		return null;
	}
}
