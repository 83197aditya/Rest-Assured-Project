package com.api.models.response;

public class ActivityResponse {
        private int id;
        private String title;
        private String dueDate;
        private boolean completed;

        public ActivityResponse() {
        }

        public ActivityResponse(int id, String title, String dueDate, boolean completed) {
            this.id = id;
            this.title = title;
            this.dueDate = dueDate;
            this.completed = completed;
        }   

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getDueDate() {
            return dueDate;
        }
        public void setDueDate(String dueDate) {
            this.dueDate = dueDate;
        }
        public boolean isCompleted() {
            return completed;
        }
        public void setCompleted(boolean completed) {
            this.completed = completed;
        }
        
        @Override
        public String toString() {
            return "ActivitiesRequest [id=" + id + ", title=" + title + ", dueDate=" + dueDate + ", completed=" + completed + "]";
        }   
}
