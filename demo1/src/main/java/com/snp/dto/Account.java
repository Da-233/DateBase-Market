package com.snp.dto;

public class Account {
    int rankId;
    int userId;
    String acc;
    String accKey;

    public Account() {
    }

    public Account(int rankId, int userId, String acc, String accKey) {
        this.rankId = rankId;
        this.userId = userId;
        this.acc = acc;
        this.accKey = accKey;
    }

    public int getRankId() {
        return rankId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getAccKey() {
        return accKey;
    }

    public void setAccKey(String accKey) {
        this.accKey = accKey;
    }

    @Override
    public String toString() {
        return "Account{" +
                "rankId=" + rankId +
                ", userId=" + userId +
                ", acc='" + acc + '\'' +
                ", accKey='" + accKey + '\'' +
                '}';
    }
}
