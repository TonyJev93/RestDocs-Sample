package com.tonyjev93.restdocs.ex.presentation.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

=======
>>>>>>> 9103aad96bb0a34f86d130c51c64a4334e96a6cf
@Getter
@Setter
public class RestDocsTestResponseDto {
    @Getter
<<<<<<< HEAD
    public static class Res extends RepresentationModel { // HATOAS를 위한 Class 상속
        Map<String, String> contact = new HashMap<>();

        public Res() {
            this.contact.put("name", "JUN");
            this.contact.put("email", "allstarz12@lotte.net");
        }
=======
    public static class Res extends RepresentationModel {
        public Res() {}
>>>>>>> 9103aad96bb0a34f86d130c51c64a4334e96a6cf
    }
}
