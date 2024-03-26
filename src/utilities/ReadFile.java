package utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public ReadFile(File file) throws Exception{
        File input = new File(String.valueOf(file));
        try{
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObj = fileElement.getAsJsonObject();
            String roomName = fileObj.get("roomeName").getAsString();
            String noOfPersons = fileObj.get("noOfPersons").getAsString();
            String area = fileObj.get("area").getAsString();
            String stars = fileObj.get("stars").getAsString();
            String noOfReviews = fileObj.get("noOfReviews").getAsString();
            String roomImage = fileObj.get("roomImage").getAsString();
            System.out.println(roomName + " " +  noOfPersons + " " + area + " " +stars + " " + " " + noOfReviews + " " + roomImage);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ReadFile file = new ReadFile(new File("booking_2024/src/utilities/rooms.json"));
    }
}
