package com.livestrong.tracker.googlefitmodule.Interfaces;


import java.util.Date;

/**
 * Created by shambhavipunja on 2/4/16.
 */
public interface CardModelInterface {
    public void getDataForDate(Date date, OnCardDataReady onCardDataReady);
}
