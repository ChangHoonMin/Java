package enums.jdk7;

public enum BoyFriend {
    REDBOY("111", "devljh"),
    BLUEBOY("222", "powerman"),
    BLACKBOY("333", "goodgame");

    private String id;
    private String nickname;

    BoyFriend(String id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
}


