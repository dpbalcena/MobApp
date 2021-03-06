package ph.edu.apc.roadtweet;

import java.util.Date;

/**
 * Created by School on 11/30/2016.
 */

public class ChatMessage {

    private String messageText;
    private String messageUser;
    private long messageTime;
    private String messageLocation;
    private String messageImage;

    public ChatMessage(String messageImage, String messageLocation, String messageText, String messageUser) {
        this.messageImage = messageImage;
        this.messageLocation = messageLocation;
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
    }

    public ChatMessage(){

    }

    public String getMessageImage() {
        return messageImage;
    }
    public void setMessageImage(String messageImage) {
        this.messageImage = messageImage;
    }

    public String getMessageLocation() {
        return messageLocation;
    }
    public void setMessageLocation(String messageLocation) {
        this.messageLocation = messageLocation;
    }

    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }
    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }
    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

}
