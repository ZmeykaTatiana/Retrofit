package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SingleUserResponse {
    private UserResponse data;
    private Support support;
}
