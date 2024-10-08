package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserUpdateResponse {
    private String name;
    private String job;
    private Date updatedAt;
}
