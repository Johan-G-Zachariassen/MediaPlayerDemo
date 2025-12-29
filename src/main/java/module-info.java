module dk.sea.mediaplayerdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    //requires javafx.media;


    opens dk.sea.mediaplayerdemo to javafx.fxml;
    exports dk.sea.mediaplayerdemo;
}