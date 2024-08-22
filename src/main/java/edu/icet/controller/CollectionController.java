package edu.icet.controller;

import edu.icet.dto.CollectionDto;
import edu.icet.service.CollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collection")
@CrossOrigin
@RequiredArgsConstructor
public class CollectionController {

    final CollectionService collectionService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addCollection(@RequestBody CollectionDto collectionDto){
       return collectionService.addCollection(collectionDto);
    }

    @DeleteMapping("delete/{id}")
    public  boolean deleteCollectionById(@PathVariable int id){
        return collectionService.delete(id);
    }

    @GetMapping("/get-all")
    public List<CollectionDto> getAllCollection(){
        return collectionService.getAll();
    }

    @PatchMapping("update/{id}")
    public boolean updateCollectionById(@PathVariable int id,@RequestBody CollectionDto collectionDto){
        return  collectionService.updateCollectionById(id,collectionDto);
    }
}
