package com.example.gold.remoteretrofit.Domain;

/**
 * Created by Gold on 2017. 3. 7..
 */

public class Data
{
    private SearchParkingInfo SearchParkingInfo;

    public SearchParkingInfo getSearchParkingInfo ()
    {
        return SearchParkingInfo;
    }

    public void setSearchParkingInfo (SearchParkingInfo SearchParkingInfo)
    {
        this.SearchParkingInfo = SearchParkingInfo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SearchParkingInfo = "+SearchParkingInfo+"]";
    }
}

