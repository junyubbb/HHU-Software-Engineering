package com.czh.love.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Photo {
    private Integer id;
    private String photoName;
    private String date;
    private String user;
    private String url;

}
