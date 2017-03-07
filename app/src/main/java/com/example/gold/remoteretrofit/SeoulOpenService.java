package com.example.gold.remoteretrofit;

import com.example.gold.remoteretrofit.Domain.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Gold on 2017. 3. 7..
 */

public interface SeoulOpenService {
    //http://openapi.seoul.go.kr:8088/4c425976676b6f643437665377554c/json/SearchParkingInfo/1/10/강남구
    @GET("4c425976676b6f643437665377554c/json/SearchParkingInfo/1/100/{gu}")
    Call<Data> getData(@Path("gu") String value); // listRepos로 값을 가져오는데
}
