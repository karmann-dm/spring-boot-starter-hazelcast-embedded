package com.karmanno.hazelcast.marathon;

import com.karmanno.hazelcast.marathon.model.MarathonAppResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MarathonClient {
    @GET("/v2/apps/{id}")
    MarathonAppResponse getApp(@Path("id") String id);
}
