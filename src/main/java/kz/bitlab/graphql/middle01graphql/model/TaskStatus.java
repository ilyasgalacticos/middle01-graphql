package kz.bitlab.graphql.middle01graphql.model;

import lombok.Getter;

@Getter
public enum TaskStatus {

    OPEN(1, "open", "Opened Task"),
    IN_PROGRESS (2, "in_progress", "In Progress"),
    COMPLETED (3, "completed", "Completed");

    private int id;
    private String status;
    private String statusText;

    TaskStatus(int id, String status, String statusText){
        this.id = id;
        this.status = status;
        this.statusText = statusText;
    }
}
