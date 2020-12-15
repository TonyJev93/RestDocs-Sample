package com.tonyjev93.restdocs.ex.presentation.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class RestDocsTestResponseDto {
    @Getter
    public static class Res extends RepresentationModel { // HATOAS를 위한 Class 상속
        Map<String, String> contact = new HashMap<>();

        public Res() {
            this.contact.put("name", "JUN");
            this.contact.put("email", "allstarz12@lotte.net");
        }
    }
}
