package vk.proxyModel;

/**
 * 个人频道
 */
public class PersonalChannel implements Personal {

    private String channelName;

    private int subscribe;

    /**
     * 点赞
     */
    private int push;


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public int getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    public int getPush() {
        return push;
    }

    public void setPush(int push) {
        this.push = push;
    }
}
