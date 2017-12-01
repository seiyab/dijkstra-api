package com.example.api.model.json;

import com.example.api.model.table.Task;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TaskResponse {

  String contest;
  String task;
  String url;

  public static TaskResponse of(Task task) {
    return TaskResponse.builder().contest(task.getContest().getName())
        .task(task.getTaskId().getTask()).url(task.getUrl()).build();
  }
}
