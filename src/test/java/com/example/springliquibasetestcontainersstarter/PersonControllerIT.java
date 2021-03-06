package com.example.springliquibasetestcontainersstarter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@AutoConfigureMockMvc
public class PersonControllerIT extends BaseIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPeople() throws Exception {
        mockMvc.perform(get("/"))
        .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(4)));
    }

}
