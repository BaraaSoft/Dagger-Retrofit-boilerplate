package com.baraa.software.eventhorizon.androidarchitecturecomponent_0.http;

import retrofit2.http.GET;
import rx.Observable;

public interface IMovieApiService {
    @GET("movie/latest")
    Observable<String> getRecentMovies();
}
