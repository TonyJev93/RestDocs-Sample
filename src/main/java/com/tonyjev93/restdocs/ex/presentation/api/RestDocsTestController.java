package com.tonyjev93.restdocs.ex.presentation.api;

import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class RestDocsTestController {

    @GetMapping("/")
    public ResponseEntity<RestDocsTestResponseDto.Res> indexGetTest() {
        RestDocsTestResponseDto.Res res = new RestDocsTestResponseDto.Res();

        Link self = linkTo(RestDocsTestController.class).withSelfRel();
        Link alpha = linkTo(RestDocsTestController.class).withRel("alpha");
        Link bravo = linkTo(RestDocsTestController.class).withRel("bravo");
        res.add(self);
        res.add(alpha);
        res.add(bravo);

        return new ResponseEntity<RestDocsTestResponseDto.Res>(res, HttpStatus.OK);
    }

    @GetMapping("/rest/docs/test/{id}")
    public ResponseEntity<Object> restDocsGetTest(@PathVariable("id") String id) {

        RestDocsTestResponseDto restDocsTestResponseDto = new RestDocsTestResponseDto();

        return new ResponseEntity<>(restDocsTestResponseDto, HttpStatus.OK);
    }
    @GetMapping("/alpha")
    public ResponseEntity<Object> alpha(@PathVariable("id") String id) {

        RestDocsTestResponseDto restDocsTestResponseDto = new RestDocsTestResponseDto();

        return new ResponseEntity<>(restDocsTestResponseDto, HttpStatus.OK);
    }
    @GetMapping("/bravo")
    public ResponseEntity<Object> bravo(@PathVariable("id") String id) {

        RestDocsTestResponseDto restDocsTestResponseDto = new RestDocsTestResponseDto();

        return new ResponseEntity<>(restDocsTestResponseDto, HttpStatus.OK);
    }

}
