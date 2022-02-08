package com.hellokoding.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class JQueryController {

    @RequestMapping(value = "/show.ajax", method = RequestMethod.POST)
    public @ResponseBody
    List<String> your_method_name() {
        List rt = new ArrayList();
        rt.add("rt");
        return rt;
    }
}
