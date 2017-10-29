package youtube.api;

import com.google.api.services.youtube.model.*;

import java.io.IOException;
import java.util.List;

import static youtube.api.util.YoutubeHelper.getListOfUploadedYouTubeVideos;
import static youtube.api.util.YoutubeHelper.getYoutubeChannels;


public class YoutubeApi {



    public static void main(String[] args) throws IOException {
        //getListOfUploadedYouTubeVideos();
        //Get youtube channels
        List<Channel> channelList = getYoutubeChannels();

    }
}

