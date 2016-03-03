package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageTileView extends TilePane {
    public ImageTileView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ImageTileView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

//    public void addImagesForPath(String path) {
//        File folder = new File(path);
//        File[] listOfFiles = folder.listFiles();
//
//        for (final File file : listOfFiles) {
//            ImageView imageView;
//            imageView = this.createImageView(file);
//            this.getChildren().addAll(imageView);
//        }
//    }
//
//    private ImageView createImageView(final File imageFile) {
//        // DEFAULT_THUMBNAIL_WIDTH is a constant you need to define
//        // The last two arguments are: preser/*/*/**/*/*/veRatio, and use smooth (slower) resizing
//
//        ImageView imageView = null;
//        try {
//
//            final Image image;
//
//            image = new Image(new FileInputStream(imageFile), 100, 0, true, true);
//            imageView = new ImageView(image);
//
//        } catch (FileNotFoundException ex) {
//
//        }
//        return imageView;
//
//    }
}
