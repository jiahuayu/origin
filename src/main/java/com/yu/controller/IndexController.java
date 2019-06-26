package com.yu.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yu on 2017/11/20.
 */
@Controller
@RequestMapping(value="/api/")
public class IndexController {

    private static  final String DATE_FORMAT_DEFAULT = "yyyy/MM/dd HH:mm:ss" ;

    @RequestMapping(value="/index")
    public String  index(){
       return "index" ;
    }


    /**
     * 测试json返回值
     */
    @RequestMapping(value = "/version",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String version(){
        JSONObject  object = new JSONObject() ;
        object.put("version","1.0.0") ;
        object.put("author" ,"Yu") ;
        SimpleDateFormat dateFormat   = new SimpleDateFormat(DATE_FORMAT_DEFAULT) ;
        object.put("date",dateFormat.format(new Date())) ;
        return  object.toString() ;
    }
}
