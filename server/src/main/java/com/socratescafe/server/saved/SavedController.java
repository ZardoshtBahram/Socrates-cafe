package com.socratescafe.server.saved;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class SavedController {
    @Autowired
    private SavedRepository savedRepository;

    @GetMapping("/api/saved")
    public ResponseEntity<Iterable<Saved>> findAll() {
        Iterable<Saved> saved = savedRepository.findAll();
        return new ResponseEntity<Iterable<Saved>>(saved, HttpStatus.OK);
    }

    @PutMapping("/api/saved")
    public ResponseEntity<Saved> updateOne(@RequestBody Saved saved) {
        Saved updatedSaved = savedRepository.save(saved);
        return new ResponseEntity<Saved>(updatedSaved, HttpStatus.OK);
    }

    @PostMapping("/api/saved")
    public ResponseEntity<Saved> addOne(@RequestBody Saved saved) {
        Saved newSaved = savedRepository.save(saved);
        return new ResponseEntity<Saved>(newSaved, HttpStatus.OK);
    }

    @DeleteMapping("/api/saved/{id}")
    public ResponseEntity<Integer> deleteOne(@PathVariable long id) {
        return new ResponseEntity<Integer>(savedRepository.deleteOne(id), HttpStatus.OK);
    }
}
