package com.projectdijkstra.api.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultErrorController implements ErrorController {
  private final static String PATH = "/error";

  @RequestMapping("/error")
  public Map<String, String> error() {
    HashMap<String, String> responseBody = new HashMap<>();
    responseBody.put("message", "Invalid Request.");
    return responseBody;
  }

  @Override
  public String getErrorPath() {
    return PATH;
  }

}
