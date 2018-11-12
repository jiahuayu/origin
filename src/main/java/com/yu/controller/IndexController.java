package com.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by yu on 2017/11/20.
 */
@Controller
@RequestMapping(value="/")
public class IndexController {

    @RequestMapping(value="index")
    public void index(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
