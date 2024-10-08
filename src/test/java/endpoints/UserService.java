package endpoints;

import lombok.experimental.Delegate;
import model.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {
    @GET("api/users")
    Call<UserListRootResponse> getUsers(@Query("page") int pageNum);

    @GET("api/users/{id}")
    Call<SingleUserResponse> getSingleUserById(@Path("id") int num);

    @POST("api/users")
    Call<CreateUserResponse> getUserCreated(@Body UserRequest userRequest);

    @PUT("api/users/{id}")
    Call<UserUpdateResponse> getUserUpdated(@Path("id") int id, @Body UserRequest userRequest);

    @DELETE("api/users/{id}")
    Call<Void> deleteUser(@Path("id") int id);






}
