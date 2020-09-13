package com.example.androidleadersboard;

import java.util.List;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("/1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse")     // API's endpoints
    public void registration(@Field("entry.1824927963") String emailaddress,
                             @Field("entry.1877115667") String firstname,
                             @Field("entry.2006916086") String lastname,
                             @Field("entry.284483984") String linktoproject,
                             Callback<SubmitProjectDetails> callback);

}
