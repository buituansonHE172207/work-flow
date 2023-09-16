package com.test.test_git.model;

public enum AccountStatus {
    ACTIVE("Hoạt động"),
    INACTIVE("Không hoạt động"),
    SUSPENDED("Tạm ngưng"),
    CLOSED("Đóng");

    private String displayName;

    AccountStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


}