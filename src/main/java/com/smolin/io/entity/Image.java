package com.smolin.io.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "image", unique = false, nullable = false, length = 100000)
    private byte[] image;

    public Image() {
    }

    public Image(String name, String type, byte[] image) {
        this.name = name;
        this.type = type;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public static ImageBuilder builder() {
        return new ImageBuilder();
    }

    public static class ImageBuilder{

        private String name;
        private String type;
        private byte[] image;


        public ImageBuilder name(final String name) {
            this.name = name;
            return this;
}

        public ImageBuilder type(final String type) {
            this.type = type;
            return this;
        }

        public ImageBuilder image(final byte[] image) {
            this.image = image;
            return this;
        }

        public Image build() {
            return new Image(name, type, image);
        }
    }


}
