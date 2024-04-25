package com.snp.dto;

public class Account {
    int rankId;
    int userId;
    String acc;
    String Key;

    public Account() {
    }

    public Account(int rankId, int userId, String acc, String accKey) {
        this.rankId = rankId;
        this.userId = userId;
        this.acc = acc;
        this.Key = accKey;
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

    public String getKey() {
        return Key;
    }

    public void setKey(String Key) {
        this.Key = Key;
    }

    @Override
    public String toString() {
        return "Account{" +
                "rankId=" + rankId +
                ", userId=" + userId +
                ", acc='" + acc + '\'' +
                ", accKey='" + Key + '\'' +
                '}';
    }
}
