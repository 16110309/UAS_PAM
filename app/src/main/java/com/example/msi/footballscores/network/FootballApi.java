package com.example.msi.footballscores.network;

import com.example.msi.footballscores.network.model.FixturesResponse;
import com.example.msi.footballscores.network.model.Season;
import com.example.msi.footballscores.network.model.TeamResponse;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface FootballApi {

    @GET("/soccerseasons") List<Season> seasons();

    @GET("/soccerseasons/{id}/teams") TeamResponse teams(
            @Path("id") String seasonId);

    @GET("/fixtures") FixturesResponse fixtures(
            @Query("timeFrame") String timeFrame);

}