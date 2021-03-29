package me.iiaii.springmvcintro.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import me.iiaii.springmvcintro.servlet.basic.dto.HelloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
@RequiredArgsConstructor
public class ResponseJsonServlet extends HttpServlet {

    private final ObjectMapper objectMapper;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");

        HelloData helloData = new HelloData();
        helloData.setUsername("hello");
        helloData.setAge(20);

        String result = objectMapper.writeValueAsString(helloData);
        resp.getWriter().write(result);
    }


}
