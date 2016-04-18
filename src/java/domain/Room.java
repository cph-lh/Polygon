package domain;

public class Room
{
    int roomID;
    String roomName, roomComment, rRecommendation;

    public Room(int roomID, String roomName, String roomComment, String rRecommendation)
    {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomComment = roomComment;
        this.rRecommendation = rRecommendation;
    }

    public int getRoomID()
    {
        return roomID;
    }

    public void setRoomID(int roomID)
    {
        this.roomID = roomID;
    }

    public String getRoomName()
    {
        return roomName;
    }

    public void setRoomName(String roomName)
    {
        this.roomName = roomName;
    }

    public String getRoomComment()
    {
        return roomComment;
    }

    public void setRoomComment(String roomComment)
    {
        this.roomComment = roomComment;
    }

    public String getrRecommendation()
    {
        return rRecommendation;
    }

    public void setrRecommendation(String rRecommendation)
    {
        this.rRecommendation = rRecommendation;
    }
    
}
