package dk.sea.mediaplayerdemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the hello-view.fxml
 * This is a PoC, dont keep the sample names in your project
 *
 * This view contains logic for playing mediafiles
 *
 * The view will ask for a controller, by usage of the fx:controller property in the FXML
 *
 * Meaning the view has the responsibility of getting its own controller
 * FHA 2025-12-29
 */
public class HelloController implements Initializable {

    @FXML
    private MediaView mediaV;   //This instance is used from the GUI, hence @FXML annotation

    @FXML
    private Button play;    //This instance is used from the GUI, hence @FXML annotation

    private MediaPlayer mp;
    private Media me;


    /**
     * This method is invoked automatically in the beginning. Used for initializing, loading data etc.
     * Notice the notation @override, this method is defined in the interface Initializeable (Wonderfull Java interface naming standard
     * FHA 2025-12-29
     *
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Build the path to the location of the media file
        String path = new File("src/main/java/dk/sea/mediaplayerdemo/media/file_example_MP4_640_3MG.mp4").getAbsolutePath();
        // Create new Media object (the actual media content)
        me = new Media(new File(path).toURI().toString());
        // Create new MediaPlayer and attach the media to be played
        mp = new MediaPlayer(me);

        mediaV.setMediaPlayer(mp);
        // mp.setAutoPlay(true);
        // If autoplay is turned off, the method play(), stop(), pause() etc controls how/when medias are played
        mp.setAutoPlay(false);

    }

    @FXML
    /**
     * Handler for the play button
     */
    private void handlePlay()
    {
        // Play the mediaPlayer with the attached media
        mp.play();
    }
}