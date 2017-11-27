package com.example.api.domain.model.json;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TaskResponse {

  String contest;
  String task;
  String url;
}
