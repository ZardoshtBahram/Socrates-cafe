package com.socratescafe.server.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class CommentController {
      @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/api/comment")
    public ResponseEntity<Iterable<Comment>> findAll() {
        Iterable<Comment> comment = commentRepository.findAll();
        return new ResponseEntity<Iterable<Comment>>(comment, HttpStatus.OK);
    }

    @PutMapping("/api/comment")
    public ResponseEntity<Comment> updateOne(@RequestBody Comment comment) {
        Comment updatedComment = commentRepository.save(comment);
        return new ResponseEntity<Comment>(updatedComment, HttpStatus.OK);
    }

    @PostMapping("/api/comment")
    public ResponseEntity<Comment> addOne(@RequestBody Comment comment) {
        Comment newComment = commentRepository.save(comment);
        return new ResponseEntity<Comment>(newComment, HttpStatus.OK);
    }

    @DeleteMapping("/api/comment/{id}")
    public ResponseEntity<Integer> deleteOne(@PathVariable long id) {
        return new ResponseEntity<Integer>(commentRepository.deleteOne(id), HttpStatus.OK);
    }
}
