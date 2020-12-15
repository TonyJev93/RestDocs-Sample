package com.tonyjev93.restdocs.ex.presentation.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD
import org.springframework.hateoas.MediaTypes;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
=======
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
>>>>>>> 9103aad96bb0a34f86d130c51c64a4334e96a6cf
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.*;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
<<<<<<< HEAD
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
=======
>>>>>>> 9103aad96bb0a34f86d130c51c64a4334e96a6cf
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
class RestDocsTestControllerTest {

    private MockMvc mockMvc;
<<<<<<< HEAD
    private RestDocumentationResultHandler document;

    @BeforeEach
    public void setUp(WebApplicationContext webApplicationContext, RestDocumentationContextProvider restDocumentation) {
        this.document = document("{class-name}/{method-name}/{step}/");
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .alwaysDo(print())
                .alwaysDo(this.document)
                .apply(documentationConfiguration(restDocumentation)
                        .operationPreprocessors()
                        .withRequestDefaults(prettyPrint())
                        .withResponseDefaults(prettyPrint()))
                .build();
=======

    @BeforeEach
    public void setUp(WebApplicationContext webApplicationContext, RestDocumentationContextProvider restDocumentation) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).alwaysDo(print()).apply(documentationConfiguration(restDocumentation)).build();
>>>>>>> 9103aad96bb0a34f86d130c51c64a4334e96a6cf
    }

    @Test
    public void indexTest() throws Exception {
        // halLinks() : _links 인식
<<<<<<< HEAD
        this.mockMvc.perform(get("/").accept(MediaTypes.HAL_JSON))
                .andExpect(status().isOk())
                .andDo(this.document.document(
                        links(halLinks(),
                                linkWithRel("self").description("Link to the self resource"),
                                linkWithRel("alpha").description("Link to the alpha resource"),
                                linkWithRel("bravo").description("Link to the bravo resource")),
                        responseFields(
                                fieldWithPath("contact.name").description("The user's name"),
                                fieldWithPath("contact.email").description("The user's email address"),
                                subsectionWithPath("_links").description("links")
                        )
                        )
                );
=======
        this.mockMvc.perform(get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("index", links(halLinks(), linkWithRel("self").description("Link to the self resource"), linkWithRel("alpha").description("Link to the alpha resource"),
                        linkWithRel("bravo").description("Link to the bravo resource"))));
>>>>>>> 9103aad96bb0a34f86d130c51c64a4334e96a6cf
    }
}
