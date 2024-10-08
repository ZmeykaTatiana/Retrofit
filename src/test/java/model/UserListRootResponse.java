package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class UserListRootResponse {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private ArrayList<UserResponse> data;
    private Support support;
}
