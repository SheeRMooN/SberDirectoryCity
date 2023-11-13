package org.example.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class City {
    public String name;
    public String region;
    public String district;
    public Long population;
    public String foundation;
}
