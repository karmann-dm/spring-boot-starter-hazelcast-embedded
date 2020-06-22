package com.karmanno.hazelcast;

import com.karmanno.hazelcast.settings.MarathonDiscoverySettings;
import lombok.RequiredArgsConstructor;
import okhttp3.OkHttpClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
@RequiredArgsConstructor
public class MarathonDiscoveryConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "cache.hazelcast.marathon")
    public MarathonDiscoverySettings marathonDiscoverySettings() {
        return new MarathonDiscoverySettings();
    }

    @Bean
    public OkHttpClient httpClient() {
        return new OkHttpClient.Builder().build();
    }

    @Bean
    public Retrofit marathonRetrofit(MarathonDiscoverySettings discoverySettings,
                                     OkHttpClient httpClient) {
        return new Retrofit.Builder()
                .baseUrl(discoverySettings.getMarathonEndpoint())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
    }
}
