package tests;

import endpoints.UserService;
import model.UserListRootResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class UserTest {
    private final Retrofit retrofit=new Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private final UserService userService=retrofit.create(UserService.class);
    @Test
    public void checkList() throws IOException {
        int num=2;
        Response <UserListRootResponse> responseCall=userService.getUsers(num).execute();
        Assertions.assertTrue(responseCall.isSuccessful());
        int actual=responseCall.body().getPage();
        Assertions.assertEquals(num,actual);
    }
}
