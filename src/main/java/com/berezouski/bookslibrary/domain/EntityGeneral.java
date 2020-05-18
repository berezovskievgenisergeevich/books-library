package com.berezouski.bookslibrary.domain;

public class EntityGeneral {

    private String entityName;

    public EntityGeneral() {
        this.entityName = this.getClass().getSimpleName().toLowerCase();
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
}
