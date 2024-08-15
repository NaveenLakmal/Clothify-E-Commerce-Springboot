package edu.icet.controller;

import edu.icet.entity.Collection;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/collection")
@CrossOrigin
@RequiredArgsConstructor
public class CollectionController {

    final CollectionService collectionService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCollection(@RequestBody Collection collectionDto){
        collectionService.addCollection(collectionDto);
    }
}
