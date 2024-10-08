package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class CreateUserResponse {
    private String name;
    private String job;
    private String id;
    private Date createdAt;
}
