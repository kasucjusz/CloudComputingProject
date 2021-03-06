package com.cloudcomputing.aggregation.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "temperature")
@Data
public class TemperatureModel {
private String sensorId;
private String date;
private Long temp;
}
