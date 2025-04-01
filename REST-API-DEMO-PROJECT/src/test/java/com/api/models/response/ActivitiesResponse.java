package com.api.models.response;

import java.util.List;

public class ActivitiesResponse {
    private List<ActivityResponse> activities;
    
    public List<ActivityResponse> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivityResponse> activities) {
        this.activities = activities;
    }
}