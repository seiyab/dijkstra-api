package com.projectdijkstra.api.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projectdijkstra.api.model.table.Algorithm;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AlgorithmResponse {

  @JsonProperty("algorithm_id")
  Integer algorithmId;
  String name;

  public static AlgorithmResponse of(Algorithm algorithm) {
    return AlgorithmResponse.builder().algorithmId(algorithm.getAlgorithmId())
        .name(algorithm.getNameJp()).build();
  }
}
