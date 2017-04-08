package com.shearf.demo.springboot;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.shearf.demo.springboot.config.HttpConfig;
import com.shearf.demo.springboot.controller.FooController;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*
        ;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.gargoylesoftware.htmlunit.*;

/**
 * Created by xiahaihu on 17/4/5.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(FooController.class)
public class MockMvcTests {

    @MockBean
    private HttpConfig httpConfig;

    @Autowired
    private WebClient webClient;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void fooControllerTest() throws Exception {

        given(httpConfig.getUrl()).willReturn("http");

        HtmlPage page =  webClient.getPage("/foo/t_url");

        assertThat(page.getBody().getTextContent()).isEqualTo("http");

        mockMvc.perform(get("/foo/t_url").accept(MediaType.TEXT_PLAIN)).
                andExpect(status().isOk()).andExpect(content().string("http"));
    }
}
